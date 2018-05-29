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

enum Apple {Jomathan, GoldenDel, RedDel, Winesap, Cortland}
public class EnumMethodsDemo {
    public static void main(String[] args) {
        Apple ap, ap2, ap3;
        System.out.println("All ordinals");
        for (Apple a : Apple.values()) {
            System.out.println(a + " ordinal : " + a.ordinal());            
        }
        
        ap = Apple.RedDel;
        ap2 = Apple.GoldenDel;
        ap3 = Apple.Cortland;
        
        System.out.println(ap.compareTo(ap2));
        
        
    }
}
