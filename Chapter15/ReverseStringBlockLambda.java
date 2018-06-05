

package Chapter15;

/**
 * This program demonstrates a block lambda expression that reverses the given String
 * @author Adarsh V
 */

interface StringFunction {
    String stringFcn(String s);
}
public class ReverseStringBlockLambda {
    
    public static void main(String[] args) {
        StringFunction sfn = (s) -> {
            String result = "";
            for (int i = s.length() -1; i >=0 ; i--){
                result = result + s.charAt(i);
            }
            return result;
        };
        System.out.println("Reverse of 'Adarsh' " + sfn.stringFcn("Adarsh"));
        System.out.println("Reverse of 'Test' " + sfn.stringFcn("Test"));
    }
    
    
}
