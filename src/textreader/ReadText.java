package textreader;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class ReadText {

    public static void main(String[] args) throws FileNotFoundException, IOException {
        
        File file = new File("Sachin.txt");
        
        Scanner scan = new Scanner(file);
       
        while(scan.hasNextLine()){
            
            System.out.println(scan.nextLine());
            
        }
        
    }
    
}
