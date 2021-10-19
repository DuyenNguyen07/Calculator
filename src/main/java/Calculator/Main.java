package Calculator;

import java.util.Scanner;

import static Calculator.Calculator.*;
import static Calculator.File.writeFile;
import static Calculator.Message.continueMessage;

public class Main {

    public static Scanner reader = new Scanner(System.in);

    // Please change the file path for checking
    public static String filePath = "C:\\Users\\Duyen_Nguyen\\Desktop\\Calculator\\src\\main\\resources\\result.txt";


    public static void main(String[] args) {
        do {
            writeFile(filePath, cal());
        } while (continueMessage());
    }
}
