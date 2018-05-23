/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter11;

/**
 *
 * @author Adarsh V
 */
public class MultiThreadDemo {
    public static void main(String[] args) {
        new MultipleThreads("One");
        new MultipleThreads("Two");
        new MultipleThreads("Three");
        
        try {
            //wait for other threads to end
            Thread.sleep(10000);
        }
        catch (InterruptedException ex) {
            System.out.println("Main thread interrupted");
        }
        System.out.println("Main thread exiting");
    }
}
