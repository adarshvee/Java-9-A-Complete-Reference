/*
 * Dynamic sized stack
 */
package chapter9;

/**
 *
 * @author Adarsh V
 */
public class DynStack {
    private int stk[];
    private int top;
    
    DynStack(int size) {
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
            int tmp[] = new int[stk.length * 2];
            for (int j = 0; j<stk.length; j++) tmp[j] = stk[j];
            stk = tmp;           
        }
        stk[++top] = i;
    } 
}
