/*
 * Simplistic read of a file using FileInputStrea. File name is a parameter to
the Main method. Uses file.close() which is not recommended
 */
package Chapter13;

/**
 *
 * @author Adarsh V
 */
import java.io.*;
public class SimplisticFileReader {
    public static void main(String[] args) {
        int i;
        FileInputStream fin = null;
        
        if (args.length != 1) {
            System.out.println("Please pass in the name of the file");
            return;
        }
        
        try {
            fin = new FileInputStream(args[0]);
        } catch (FileNotFoundException ex) {
            System.out.println("File not found");
        }
        
        try {
            do {
                i = fin.read();
                if (i != -1) System.out.print((char) i);
            } while (i!=-1);            
        } catch (IOException ex) {
            System.out.println("Caught IOException");
        }
        
        try {
            fin.close();
        } catch (IOException ex) {
            System.out.println("Error while closing the file");
        }
    }
}
