package textreader;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class RemoveSpaces {

    public static void main(String[] args) throws FileNotFoundException, IOException {
        
        String inputFileName = "FinalOutput.txt";
        String outputFileName = "FinalWords.txt";

        BufferedReader inputFile = new BufferedReader(new FileReader(inputFileName));
        PrintWriter outputFile = new PrintWriter(new FileWriter(outputFileName));

   String lineOfText = inputFile.readLine();

   while(lineOfText != null)
{
   if (!lineOfText.isEmpty())
   {
      outputFile.println(lineOfText);
   }
   lineOfText = inputFile.readLine();
}

   inputFile.close();
   outputFile.close();
}
    
}


