package textreader;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Reader {

    public static void main(String[] args) throws FileNotFoundException, IOException {
        
        File file = new File("Sachin.txt");
        
        BufferedReader read = new BufferedReader(new FileReader(file));
        
        String reader;
        
        while((reader = read.readLine())!= null){
            
            System.out.println(reader);
            
        }
        
    }
    
}
