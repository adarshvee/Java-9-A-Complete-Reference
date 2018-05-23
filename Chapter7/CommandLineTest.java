/*
 * Program to test command line arguements, especially when the program is called
through an IDE
 */
package Chapter7;

/**
 *
 * @author Adarsh V
 */
public class CommandLineTest {
    public static void main(String[] args) {
        for (int i=0; i< args.length; i++) {
            System.out.println("args[" + i + "] = " + args[i]);
        }
    }
}
