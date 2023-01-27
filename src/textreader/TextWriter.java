package textreader;

import java.io.*;
import java.util.Scanner;

public class TextWriter {

    public static void main(String[] args) throws IOException {
        try {
            
            File folder = new File("Writer");
            folder.mkdir();

            String inputfile = "Sentences.txt";
            
            double nol = 1.0;
            
            File file = new File(inputfile);
            Scanner scanner = new Scanner(file);
            
            int count = 0;
            while (scanner.hasNextLine()) {
                scanner.nextLine();
                count++;
            }

            double temp = (count / nol);
            int temp1 = (int) temp;
            int nof = 0;
            if (temp1 == temp) {
                nof = temp1;
            } else {
                nof = temp1 + 1;
            }
            
            FileInputStream fstream = new FileInputStream(inputfile);
            DataInputStream in = new DataInputStream(fstream);

            BufferedReader br = new BufferedReader(new InputStreamReader(in));
            String strLine;

            for (int j = 1; j <= nof; j++) {

                FileWriter fstream1 = new FileWriter("Writer\\S" + j + ".txt");
                BufferedWriter out = new BufferedWriter(fstream1);
                for (int i = 1; i <= nol; i++) {
                    strLine = br.readLine();
                    if (strLine != null) {
                        out.write(strLine);
                        if (i != nol) {
                            out.newLine();
                        }
                    }
                }
                out.close();
            }

            in.close();
        } catch (Exception e) {
            System.err.println("Error: " + e.getMessage());
        }

    }
}

