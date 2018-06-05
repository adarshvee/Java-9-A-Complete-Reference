

package Chapter15;

/**
 *This program demonstrates the use of a method reference to a static class using
 * className::methodName construct
 * @author Adarsh V
 */

interface StringManipulator {
    String func(String s);
}

class MyStringOps {
    //A static method that reverses a String
    static String strReverse(String str){
        String result = "";
        for (int i = str.length() - 1; i >=0; i--) {
            result += str.charAt(i);
        }
        return result;
    }
}
public class MethodReferenceToStaticMethods {
    //A functional interface as a parameter
    static String stringOp(StringManipulator sm, String s) {
        return sm.func(s);
    }
    
    public static void main(String[] args) {
        String inStr = "Lambda adds great expressiveness to Java";
        String outStr;
        //Pass a method reference as param
        outStr = stringOp(MyStringOps::strReverse, inStr);
        System.out.println("Input : " + inStr + " | Output : " + outStr);
    }
}
