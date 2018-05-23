/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter2;

/**
 *
 * @author Adarsh V
 */
public class BlockTest {
    public static void main(String[] args) {
        int x, y;
        y = 20;
        for (x=0; x<10; x++)
        {
            System.out.println("The value of x is " + x);
            System.out.println("The value of y is " + y);
            y = y-2;
        }
    }
}
