/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter13;
import java.io.*;
/**
 *
 * @author Adarsh V
 */
public class MiniEditor {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter multiple lines of String, 'stop' to quit");
        String text[] = new String[100];
        try {
            for (int i =0; i<100; i++) {
                text[i] = br.readLine();
                if (text[i].equals("stop")) {
                    break;
                }
            }
        } catch (IOException ex) {
            System.out.println("IO Error");
        }
        
        for (int i = 0; i < 100; i++) {
            if (text[i].equals("stop")) {
                    break;
            }
            System.out.println(text[i]);
        }
    }
}
