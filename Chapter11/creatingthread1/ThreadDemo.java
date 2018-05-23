/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter11.creatingthread1;

/**
 *
 * @author Adarsh V
 */
public class ThreadDemo {
    public static void main(String[] args) {
        new NewThread();
        try {
            for (int i = 10; i>5 ; i--) {
                System.out.println("Main Thread " + i);
                Thread.sleep(1000);
            }            
        } catch(InterruptedException ex) {
            System.out.println("Main thread interrupted");
        }
        System.out.println("Exiting main thread");
    }
}
