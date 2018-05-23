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

class MultiThreads implements Runnable{
    String name;
    Thread t;
    
    MultiThreads(String threadName) {
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

public class MultiThreadWithJoinDemo {
    public static void main(String[] args) {
        MultiThreads t1 = new MultiThreads("One");
        MultiThreads t2 = new MultiThreads("Two");
        MultiThreads t3 = new MultiThreads("Three");
        
        System.out.println("Is one alive " + t1.t.isAlive());
        System.out.println("Is two alive " + t2.t.isAlive());
        System.out.println("Is three alive " + t3.t.isAlive());
        
        
        try {
            System.out.println("Waiting for other threads to join");
            t1.t.join();
            t2.t.join();
            t3.t.join();
        }
        catch (InterruptedException ex) {
            System.out.println("Main thread interrupted");
        }
        
        System.out.println("Is one alive " + t1.t.isAlive());
        System.out.println("Is two alive " + t2.t.isAlive());
        System.out.println("Is three alive " + t3.t.isAlive());
        
        System.out.println("Main thread exiting");
    }
}
