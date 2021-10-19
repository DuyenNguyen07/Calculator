import org.apache.commons.lang3.ArrayUtils;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Calculator {

    public static Scanner reader = new Scanner(System.in);

    public static void main(String[] args) {

        //Thu ham ghi file
        //writeFile(cal());

        //thu ham tinh
        //cal();

        double n = inputNumber();
        System.out.println(n);
        reader.close();


        double m = inputNumber();
        System.out.println(m);
        reader.close();
    }

    public static String cal(){


        double number_1;
        double number_2;
        double result = 0;
        String operator;

        System.out.println("\nThe first number ");
        number_1 = inputNumber();

        System.out.println("\nThe operator ");
        operator = inputOperator();

        System.out.println("\nThe second number ");
        number_2 = inputNumber();

        switch(operator) {
            case "+": result = number_1 + number_2;
                break;
            case "-": result = number_1 - number_2;
                break;
            case "*": result = number_1 * number_2;
                break;
            case "/": result = number_1 / number_2;
                break;
            default: System.out.println("\nError! Please enter the correct operator: ");
        }

        System.out.print("\nThe result is given as follows:\n");
        System.out.printf(number_1 + " " + operator + " " + number_2 + " = " + result);

        String answer = number_1 + " " + operator + " " + number_2 + " = " + result;

        return answer;
    }

    public static void writeFile(String result){

        String filePath = "C:\\Users\\Duyen_Nguyen\\Desktop\\Calculator\\src\\main\\resources\\result.txt";

        try {
            FileWriter fileWriter = new FileWriter(filePath);

            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            bufferedWriter.write(result);
            bufferedWriter.close();
            System.out.println("\nWrite result successfully");
        }
        catch(IOException ex){
            ex.printStackTrace();
        }
    }

    public static double inputNumber(){
        double number;
        Scanner reader = new Scanner(System.in);

        System.out.println("Please enter number from -20 to 20: ");

        // Check if input is double
        if (reader.hasNextDouble()==false){
            return inputNumber();
        } else {
            // Check if number is from -20 to 20
            number = reader.nextDouble();
            if (number<-20 || number>20) {
                return inputNumber();
            } else {
                return number;
            }
        }
    }

    public static String inputOperator(){
        String operator;
        String[] operator_array = {"+", "-", "*", "/"};
        //Scanner reader = new Scanner(System.in);

        System.out.println("Please enter operator (+, -, *, /): ");

        operator = reader.next();

        if (ArrayUtils.contains(operator_array, operator)){
            reader.close();
            return operator;
        } else {
            return inputOperator();
        }
    }

}


