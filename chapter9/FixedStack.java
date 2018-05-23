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
public class FixedStack implements IntStack{
    private int stk[];
    private int top;
    
    FixedStack(int size) {
        stk = new int[size];
        top = -1;
    }
    
    public int pop() {
        if (top < 0) {
            System.out.println("chapter9.FixedStack.pop() Underflow");
            return 0;
        }
        return stk[top--];
    }
    
    public void push(int i) {
        if (top == stk.length - 1) {
            System.out.println("chapter9.FixedStack.push() Overflow");
        }
        else {
            stk[++top] = i;
        }
    } 
}

