/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter3;

/**
 *
 * @author Adarsh V
 */
public class CastDemo {
    public static void main(String[] args) {
        int i = 257;
        byte b;
        double d = 323.27;
        
        System.out.println("\n Conversion of int to byte");
        b = (byte) i;
        System.out.println("Int is " + i + " byte is " + b);
        
        System.out.println("\nConversion of double to int");
        i = (int) d;
        System.out.println("Double is " + d + " and int is " + i);
        
        System.out.println("\nConversion of double to byte");
        b = (byte) d;
        System.out.println("Double is " + d + " and byte is " + b);
    }
}
