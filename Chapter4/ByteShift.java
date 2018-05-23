/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter4;

/**
 *
 * @author Adarsh V
 */
public class ByteShift {
    public static void main(String[] args) {
        byte a = 64, b;
        int i;
        i = a << 2;
        b = (byte) (a << 2);
        
        System.out.println("Original value of a = " + a);
        System.out.println("b = " + b + " and i = " + i);
        
        System.out.println("Binary of -1 : " + Integer.toBinaryString(-1));
        
    }
}
