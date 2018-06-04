

package Chapter15;

/**
 * This program demonstrates a slighly more complicated lambda expression
 * that accepts parameters. The parameter of the abstract method in the functional
 * interface and the parameter in the lambda expression must match
 * @author Adarsh V
 */

interface NumericTest {
    boolean test(int n);
}
public class LambdaExpressionWithParameter {
    public static void main(String[] args) {
        NumericTest isEven = (n) -> ((n % 2) == 0);
        System.out.println("isEven(10) : " + isEven.test(10));
        System.out.println("isEven(7) : " + isEven.test(7));
        
        NumericTest isNonNegative = (n) -> (n > 0);
        System.out.println("Is Not Negative(10) : " + isNonNegative.test(10));
        System.out.println("Is Not Negative (-7) : " + isNonNegative.test(-7));
    }
}
