

package Chapter15;

/**
 * This class demonstrates the use of functional interfaces provided in the Java API
 * in java.util.function package. Used to calculate factorial
 * 
 * @author Adarsh V
 */
import java.util.function.Function;
public class BlockDemoUsingInbuiltFuncInterface {
    public static void main(String[] args) {
        //This block lambda calculates factorial of int value
        Function<Integer, Integer> factorial = (Integer n) -> {
           int result = 1;
           for (int i = 1; i <= n; i++) {
               result *= i;
           }
           return result; 
        };
        
        System.out.println("Factorial of 5 " + factorial.apply(5));
        System.out.println("Factorial of 9 " + factorial.apply(9));
    }
}
