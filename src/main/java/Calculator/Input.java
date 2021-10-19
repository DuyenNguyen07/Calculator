package Calculator;

import org.apache.commons.lang3.ArrayUtils;

import java.util.Scanner;

public class Input {
    public static double inputNumber(){
        double number;
        Scanner reader = new Scanner(System.in);

        System.out.println("Please enter number from -20 to 20: ");

        // Check if input is double
        if (reader.hasNextDouble()==false){
            System.out.println("The input is not a number. Please enter again.");
            System.out.println("Please enter number from -20 to 20: ");
            return inputNumber();
        } else {
            // Check if number is from -20 to 20
            number = reader.nextDouble();
            if (number<-20 || number>20) {
                System.out.println("Error! The number is not from -20 to 20.");
                return inputNumber();
            } else {
                return number;
            }
        }
    }

    public static String inputOperator(){
        String operator;
        String[] operator_array = {"+", "-", "*", "/"};
        Scanner reader = new Scanner(System.in);

        System.out.println("Please enter operator (+, -, *, /): ");

        operator = reader.next();

        if (ArrayUtils.contains(operator_array, operator)){
            //reader.close();
            return operator;
        } else {
            return inputOperator();
        }
    }

}
