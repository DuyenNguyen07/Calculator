package Calculator;

import static Calculator.Main.reader;

public class Message {
    public static boolean continueMessage(){
        System.out.println("Do you want to continue (y/n): ");
        String ans = reader.nextLine();
        if (ans.equals("y")){
            return true;
        } else if (ans.equals("n")){
            System.out.println("Thank you for using our calculator");
            return false;
        } else
        {
            System.out.println("Error! Wrong input. Please enter angain.");
            return continueMessage();
        }
    }

}
