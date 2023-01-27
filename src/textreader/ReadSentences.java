package textreader;
 
import java.io.*; 
public class ReadSentences { 

	public static void main(String[] args) throws IOException 
	{  
		File folder = new File("Writer"); 
 
		PrintWriter pw = new PrintWriter("Concatfiles.txt"); 

		String[] fileNames = folder.list(); 

		for (String fileName : fileNames) { 

			File f = new File(folder, fileName); 

			BufferedReader br = new BufferedReader(new FileReader(f)); 
			
			String line = br.readLine(); 
			while (line != null) { 
                            
                            System.out.println(line);

				pw.println(line); 
				line = br.readLine(); 
			} 
			pw.flush(); 
		} 
	} 
} 
