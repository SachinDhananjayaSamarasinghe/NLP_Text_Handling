package textreader;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.util.ArrayList;

public class Remainder {
    
    public static void main(String[] args) throws FileNotFoundException {
        
        
            ArrayList stopword = new ArrayList<>();
        
        try{
           
            FileInputStream fis = new FileInputStream("StopWords.txt");
            byte b[] = new byte[fis.available()];
            fis.read(b);
            fis.close();
            String data[] = new String(b).trim().split("\n");
            
            for(int i = 0; i < data.length; i++){
                
                stopword.add(data[i].trim());
            }
            
            FileInputStream fis2 = new FileInputStream("RemovePunctuations.txt");
            
            File outfile = new File("FinalOutput.txt");
            BufferedWriter write = new BufferedWriter(new FileWriter(outfile));
            
            byte b2[] = new byte[fis2.available()];
            fis2.read(b2);
            fis2.close();
            String data2[] = new String(b2).trim().split("\n");
            
            for(int i = 0; i < data2.length; i++){
                  
            String finalfile = "";
                
                String s2[] = data2[i].split("\\s");
                for(int j = 0; j < s2.length; j++){
                    
                    if(!(stopword.contains(s2[j].trim()))){
                        
                        finalfile = finalfile+s2[j]+"";
                    }
                    
                }
                
                write.write(finalfile);
            write.newLine(); 
            
            }
            
            fis2.close();
	write.close();
        }
        
        catch(Exception e){
            e.printStackTrace();
        }
        
    }
    
}
