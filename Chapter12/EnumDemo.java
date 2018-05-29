/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter12;

/**
 *
 * @author Adarsh V
 */

enum Color {RED, BLUE, GREEN, ORANGE}
public class EnumDemo {
    public static void main(String[] args) {
        Color cl;
        cl = Color.GREEN;
        System.out.println("Value of color is " + Color.GREEN);
        if (cl == Color.GREEN) {
            System.out.println("Color is green");
        }
        
        switch (cl) {
            case RED :
                System.out.println("Red color");
                break;
            case GREEN:
                System.out.println("Green color");
                break;
        }
        
        //Demonstrate values and valueOf
        for (Color c : Color.values()) {
            System.out.println(c);
        }
        
        cl = Color.valueOf("Green".toUpperCase());
        System.out.println("Color :" + cl);
        
    }
}
