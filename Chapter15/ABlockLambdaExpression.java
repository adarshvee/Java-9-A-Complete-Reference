

package Chapter15;

/**
 * This program demonstrates a block lambda. It calculates factorial of a given number
 * @author Adarsh V
 */


interface NumericFunc {
    int func(int n);
}
public class ABlockLambdaExpression {
    public static void main(String[] args) {
        NumericFunc factorial = (n) -> {
            int result = 1;
            for (int i = 1; i<=n; i++) {
                result = result * i;
            }
            return result;
        };
        System.out.println("Factorial of 3 " + factorial.func(3));
        System.out.println("Factorial of 13 " + factorial.func(13));       
    }
}
