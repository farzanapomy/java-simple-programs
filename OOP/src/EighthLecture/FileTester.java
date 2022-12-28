
package EighthLecture;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileTester {
    public static void main(String[] args)  {
        
        File inpFile = new File("C:/Users/User/Desktop/text.inp"); 
        File outFile = new File ("C:/Users/User/Desktop/textClass.out");

        try {
            
            FileReader fileReader = new FileReader(inpFile); 
            try {
                try (FileWriter fileWriter = new FileWriter(outFile)) {
                    Scanner scanner = new Scanner(System.in);
                    while (scanner.hasNext()) {
     String tempString = scanner.nextLine();
                       //System.out.println(tempString);  
                        fileWriter.write(tempString); 
                    } 
                    
                    fileWriter.close();
                    fileReader.close();
                }
            } catch (IOException ex) {
                
            }
        } catch (FileNotFoundException ex) {
            
            System.out.println("File not found. ");
        }  
}
    
    
    
    
}
