/*
 * This program demonstrates the use of IF conditions
 */
package Chapter2;

/**
 *
 * @author Adarsh V
 */
public class DemonstrateIf {
    public static void main(String[] args) {
        int x, y;
        x = 10;
        y = 20;
        if (x<y) System.out.println("x is less than y");
        
        x = x * 2;
        
        if (x == y) System.out.println("x equals y");
        
        x = x * 2;
        
        if (x > y) System.out.println("x is greater than y");
        
        //false condition
        if (x == y) System.out.println("You won't see this");
    }
}
