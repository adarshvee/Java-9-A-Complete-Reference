/*
 * A small integer stack that can hold upto 10 values
 */
package Chapter6;

/**
 *
 * @author Adarsh V
 */
public class Stack {
    int values[] = new int[10];
    int top;
    
    Stack() {
        top = -1;
    }
    
    void push (int val) {
        if (top == 9) {
            System.out.println("Stack is full");
        }
        else {
            values[++top] = val;
        }
    }
    
    int pop() {
        if (top >= 0) {
            return values[top--];
        }
        else {
            System.out.println("Stack undeflow");
            return 0;
        }
        
    }
}
