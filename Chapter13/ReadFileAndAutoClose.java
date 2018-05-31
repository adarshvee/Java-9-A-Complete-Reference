/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter13;

/**
 *
 * @author Adarsh V
 */
import java.io.*;
public class ReadFileAndAutoClose {
    public static void main(String[] args) {
        int i;
        
        if (args.length != 1) {
            System.out.println("Need file name parameter");
        }
        
        try (FileInputStream fis = new FileInputStream(args[0])) {
           do {
               i = fis.read();
               if (i!=-1) System.out.print((char) i);
           } while (i!=-1);
        } catch (FileNotFoundException ex) {
            System.out.println("FileNotFoundException Exception");
        }
        catch (IOException ex) {
            System.out.println("IO Exception");
        }
    }
}
