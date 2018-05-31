
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
public class BufferedReaderReadLineDemo {
    public static void main(String[] args) {
        String s;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter lines of text, 'stop' to quit :" );
        try {
            do {
                s = br.readLine();
                System.out.println(s);
            } while (!s.equals("stop"));
        } catch (IOException ex) {
            System.out.println("IOException thrown");
        }
    }
 
}
