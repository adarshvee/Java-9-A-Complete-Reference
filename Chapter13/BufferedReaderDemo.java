
/*
 * This program demonstrates converting the standard Byte Stream reader in
System.In to a more convenient Character Stream Reader, and then reading characters
 */
package Chapter13;
import java.io.*;
/**
 *
 * @author Adarsh V
 */
public class BufferedReaderDemo {
    public static void main(String[] args) {
        char c;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter a character, 'q' to quit :" );
        try {
            do {
                c = (char) br.read();
                System.out.println(c);
            } while (c != 'q');
        } catch (IOException ex) {
            System.out.println("IOException thrown");
        }
    }
 
}
