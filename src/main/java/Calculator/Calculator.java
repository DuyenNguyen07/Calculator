package Calculator;

import org.apache.commons.lang3.ArrayUtils;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

import static Calculator.Input.inputNumber;
import static Calculator.Input.inputOperator;
import static Calculator.Message.continueMessage;

public class Calculator {
    public static String cal(){

        double number_1;
        double number_2;
        double result = 0;
        String operator;

        System.out.println("The first number ");
        number_1 = inputNumber();

        System.out.println("\nThe operator ");
        operator = inputOperator();


        System.out.println("\nThe second number ");
        number_2 = inputNumber();

        // Check if divided by 0
        while (operator.equals("/") && number_2==0 ){
            System.out.println("Error! Cannot be divided by 0." +
                    "\nPlease enter the second number again.");
            number_2 = inputNumber();
        }

        switch(operator) {
            case "+": result = number_1 + number_2;
                break;
            case "-": result = number_1 - number_2;
                break;
            case "*": result = number_1 * number_2;
                break;
            case "/": result = number_1 / number_2;
                break;
            default: System.out.println("\nError! Cannot compute this expression.");
        }

        System.out.print("\nThe result is:\n");
        System.out.printf(number_1 + " " + operator + " " + number_2 + " = " + result);

        String answer = number_1 + " " + operator + " " + number_2 + " = " + result;

        return answer;
    }




}


