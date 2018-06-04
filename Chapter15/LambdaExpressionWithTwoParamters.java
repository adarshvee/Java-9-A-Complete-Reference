

package Chapter15;

/**
 *This program demonstrates a lambda expression that takes in two parameters
 * @author Adarsh V
 */
interface NumericTest2 {
    boolean test(int n, int d);
}

public class LambdaExpressionWithTwoParamters {
    public static void main(String[] args) {
        NumericTest2 isFactor = (n, d) -> ((n % d) == 0);
        System.out.println("Is 5 a factor of 10? " + isFactor.test(10,5));
        System.out.println("Is 4 a factor of 10? " + isFactor.test(10,4));
    }
}
