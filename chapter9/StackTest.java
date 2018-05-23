/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter9;

/**
 *
 * @author Adarsh V
 */
public class StackTest {
    public static void main(String[] args) {
        FixedStack st1 = new FixedStack(10);
        FixedStack st2 = new FixedStack(7);
        
        for (int i = 0; i < 10; i++ ) st1.push(i);
        for (int i = 0; i < 7; i++ ) st2.push(i);
        
        System.out.println("First stack");
        for (int i = 0; i < 10; i++ ) System.out.println(st1.pop());
        System.out.println("Second stack");
        for (int i = 0; i < 7; i++ ) System.out.println(st2.pop());
        
        DynStack st3 = new DynStack(5);
        for (int i = 0; i < 15; i++ ) st3.push(i);
        
        System.out.println("Third stack");
        for (int i = 0; i < 15; i++ ) System.out.println(st3.pop());
    }
}
