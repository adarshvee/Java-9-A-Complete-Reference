/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter5;

/**
 *
 * @author Adarsh V
 */
public class PrimeChecker {
    public static void main(String[] args) {
        int num;
        boolean isPrime;
        
        num = 15;
        
        if (num < 2) isPrime = false;
        else isPrime = true;
        
        for (int i=1; i<num/i; i++) {
            if (num % i == 0) {
                isPrime = false;
                break;
            }
        }
        
        System.out.println("Is the number prime? " + isPrime);
    }
}
