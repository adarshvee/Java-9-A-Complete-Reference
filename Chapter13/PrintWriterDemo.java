/*
 * Example to use PrintWriter, which is a character based stream output.
 */
package Chapter13;
import java.io.*;
/**
 *
 * @author Adarsh V
 */
public class PrintWriterDemo {
    public static void main(String[] args) {
        PrintWriter pw = new PrintWriter(System.out, true);
        
        pw.println("This is a String");
        pw.println(3);        
    }
}
