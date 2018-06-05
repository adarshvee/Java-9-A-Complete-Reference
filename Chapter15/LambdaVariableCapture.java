

package Chapter15;

/**
 * This program demonstrates variable capture by Lambdas. The variables need to
 * be "effectively final"
 * @author Adarsh V
 */

interface myFunc {
    int func(int n);
}

public class LambdaVariableCapture {
    public static void main(String[] args) {
        //A local variable that can be captured
        int num = 10;
        
        myFunc lambdaFunction = (n) -> {
          int v = num + n; //Use variable from enclosing scope
          
          //n++; is an error
          return v;
        }; 
        
        System.out.println("Output : " + lambdaFunction.func(100));
    }
}
