/*
 * An imporved version of Stack
 */
package Chapter7;

/**
 *
 * @author Adarsh V
 */
class Stack {
    private int[] values;
    private int top;
    private final int DEFAULT_SIZE = 10;
    
    Stack(int i) {
        values = new int[i];
    }
    
    Stack() {
        values = new int[DEFAULT_SIZE];
    }
    
    public void push(int i) {
        if (top == values.length - 1) {
            System.out.println("Stack overflow");
            return;
        }
        values[++top] = i;
    }
    
    public int pop() {
        if (top < 0) {
            System.out.println("Stack underflow");
            return Integer.MIN_VALUE;
        }
        return values[top--];
    }
    
}

public class StackDemo {
    public static void main(String[] args) {
        Stack st = new Stack(15);
        
        for (int i =0 ; i<15;  i++) {
            st.push(i);
        }
        
        st.push(15);
        
        for (int i =0 ; i<15;  i++) {
            System.out.println(st.pop());;
        }
        
        st.pop();
    }
}


