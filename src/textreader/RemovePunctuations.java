package textreader;
 
import java.io.*;
import java.util.*;

public class RemovePunctuations  {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        Scanner input = new Scanner(new File("Output.txt"));
        File output = new File("RemovePunctuations.txt");
        
        BufferedWriter write = new BufferedWriter(new FileWriter(output));
        
        while (input.hasNext()) {        

        String line = input.nextLine().replaceAll("\\p{P}", "");
            write.write(line);
            write.newLine(); 
        }
        
	write.close();
    }
}
    
