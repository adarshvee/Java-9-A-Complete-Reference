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
public class SuspendResume {
    public static void main(String[] args) {
        NewThread obj1 = new NewThread("One");
        NewThread obj2 = new NewThread("Two");
        
        try {
            Thread.sleep(1000);
            obj1.mySuspend();
            System.out.println("Suspending thread 1");
            
            Thread.sleep(1000);
            obj1.myResume();
            System.out.println("Resuming thread 1");
            
            Thread.sleep(1000);
            obj2.mySuspend();
            System.out.println("Suspending thread 2");
            
            Thread.sleep(1000);
            obj2.myResume();
            System.out.println("Resuming thread 2");
            
        } catch (InterruptedException ex) {
            System.out.println("Interrupted in Main");
        }
        
        try {
            System.out.println("Waiting for threads to finish");
            obj1.t.join();
            obj2.t.join();
            
        } catch (InterruptedException ex) {
            System.out.println("Interrupted in Main");
        }
        System.out.println("Main thread exiting");
        
    }
}

class NewThread implements Runnable {
    String name; //Name of thread
    Thread t;
    boolean suspendFlag;
    public void run() {
        try {
            for (int i = 15; i>0; i--) {
                System.out.println(name + " : " + i);
                Thread.sleep(200);
                synchronized(this) {
                    while(suspendFlag){
                        wait();
                    }
                }
            }
        } catch (InterruptedException ex) {
            System.out.println("Thread interrupted");
        }
    }
    
    NewThread(String threadName) {
        name = threadName;
        t = new Thread(this, name);
        System.out.println("New thread " + t);
        suspendFlag = false;
        t.start();
    }
    
    synchronized void mySuspend() {
        suspendFlag = true;
    }
    
    synchronized void myResume(){
        suspendFlag = false;
        notify();
    }
    
}
