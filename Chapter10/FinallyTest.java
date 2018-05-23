/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter10;

/**
 *
 * @author Adarsh V
 */
public class FinallyTest {
    public static void main(String[] args) {
        test();
    }
    
    private static void test() {
        System.out.println("In test");
        try {
            if (1 == 1) {
                return;
            }
            throw new NullPointerException("hey");
        } catch(ArithmeticException ex){
            System.out.println(ex);
        }
        finally {
            System.out.println("From finally");
        }
    }
}
