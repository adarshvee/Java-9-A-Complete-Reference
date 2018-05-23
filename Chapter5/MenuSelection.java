/*
 * This program shows a sample menu selection
 */
package Chapter5;

/**
 *
 * @author Adarsh V
 */
public class MenuSelection {
    public static void main(String[] args) throws java.io.IOException{
        char choice;
        do {
            System.out.println("Help on : ");
            System.out.println(" 1 If : ");
            System.out.println(" 2 Switch : ");
            System.out.println(" 3 While : ");
            System.out.println(" 4 Do While : ");
            System.out.println(" for \n : ");
            System.out.println(" Choose One : ");
            choice = (char) System.in.read();          
        } while (choice < '1' || choice > '5');
        System.out.println("\n");
        switch(choice) {
            case '1':
                System.out.println("The If: \n");
                System.out.println("if (condition) statement;");
                System.out.println("else statement;");
                break;
            case '2' :
                break;        }
        
    }
}
