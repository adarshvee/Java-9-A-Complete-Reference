

package Chapter15;

/**
 * This program demonstrates the use of generics with lambda functional interfaces
 * Combine the two functions in ABlockLambdaExpression.java and ReverseStringBlockLambda.java
 * into a single functional interface using generics
 * @author Adarsh V
 */
interface SomeFunc<T> {
    T func(T o);
}
public class LambdasWithGenerics {
    
    public static void main(String[] args) {
        SomeFunc<Integer> factorial = (n) -> {
            int result = 1;
            for (int i=1; i<=n; i++) {
                result *= i;
            }
            return result;
        };
    
        SomeFunc<String> reverse = (s) -> {
            String result = "";
            for (int i = s.length() - 1; i >=0; i--) {
                result = result + s.charAt(i);
            }
            return result;
        };

        System.out.println("Factorial of 6 : " + factorial.func(6));
        System.out.println("Reverse of 'reverse' : " + reverse.func("reverse"));
    }
    
}
