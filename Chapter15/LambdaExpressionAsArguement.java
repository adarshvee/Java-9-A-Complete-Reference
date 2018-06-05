

package Chapter15;

/**
 * This program demonstrates the use of lambda expressions as function arguements
 * The function does basic string manipulation
 * @author Adarsh V
 */

interface StringFunc {
    String func(String s);
}
public class LambdaExpressionAsArguement {
    //A method that has the functional interface as an arguement
    static String stringOp(StringFunc sf, String s) {
        return sf.func(s);
    }
    
    public static void main(String[] args) {
       String inString = "Lambdas add to Java's expressive power";
       String outString;
       //Lambdaexpression to convert to upper case
       StringFunc sf1 = (s) -> s.toUpperCase();
       System.out.println("Upper case : " + stringOp(sf1, inString));
       
       //Lambda expression to remove spaces
       outString = stringOp((s) -> {
           String result = "";
           for (int i = 0; i < s.length(); i++) {
               if (s.charAt(i) != ' ') {
                   result += s.charAt(i);
               }
           }
           return result;
        }, inString);
       
        System.out.println("Space removed " + outString);
    }
    
}
