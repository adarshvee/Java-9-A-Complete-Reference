/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter13;

/**
 *
 * @author Adarsh V
 */
public class AssertDemo {
    static int val = 3;
    
    static int getNum() {
        return val--;
    }
    public static void main(String[] args) {
        int n = 0;
        
        for (int i=0; i<10; i++) {
            n = getNum();
        }
        
        assert n > 0 : "n is negative";
        System.out.println("n is " + n);
    }
}
