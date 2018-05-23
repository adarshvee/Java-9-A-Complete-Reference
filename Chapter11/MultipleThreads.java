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
public class MultipleThreads implements Runnable{
    String name;
    Thread t;
    
    MultipleThreads(String threadName) {
        name = threadName;
        t = new Thread(this, name);
        System.out.println("New Thread " + t);
        t.start();
    }
    
    public void run() {
        try {
            for (int i = 5; i>0; i--) {
                System.out.println(name + " thread " + i);
                Thread.sleep(1000);
            }
        }
        catch (InterruptedException ex) {
            System.out.println(name + " interrupted");
        }
        System.out.println(name + " exiting");
    }
}
