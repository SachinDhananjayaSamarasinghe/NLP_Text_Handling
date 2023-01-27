package textreader;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FinalWords {

    public static void main(String[] args) throws FileNotFoundException, IOException {
        
        File file = new File("Words.txt");
        
        File outfile = new File("Output.txt");
        
        BufferedReader read = new BufferedReader(new FileReader(file));
        
        BufferedWriter write = new BufferedWriter(new FileWriter(outfile));
        
        String reader;
        
        while((reader = read.readLine())!= null){
            
        reader = reader.toLowerCase();    
            
            write.write(reader);
            write.newLine();   
        }
        
        read.close();
 
	write.close();
        
    }
    
}



