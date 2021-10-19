package Calculator;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class File {
    public static void writeFile(String filePath, String result){

        try {
            FileWriter fileWriter = new FileWriter(filePath);

            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            bufferedWriter.append(result);
            bufferedWriter.newLine();

            bufferedWriter.close();
            System.out.println("\nWrite result successfully." +
                    "Please find the result in result.txt.");
        }
        catch(IOException ex){
            ex.printStackTrace();
        }
    }
}
