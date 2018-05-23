/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter11.creatingthread2;

/**
 *
 * @author Adarsh V
 */

class NewThread extends Thread {
    NewThread(){
        super("Demo Thread");
        System.out.println("Child thread " + this);
        start();
    }
    
    public void run() {
        try {
            for (int i = 5; i>0; i--) {
                System.out.println("Child thread " + i);
                Thread.sleep(500);
            }
        }
        catch (InterruptedException ex) {
            System.out.println("Child interrupted");
        }
    }
}

public class ExtendThread {
    public static void main(String[] args) {
        new NewThread();
        
        try {
            for (int i = 5; i>0; i--) {
                System.out.println("Main thread " + i);
                Thread.sleep(1000);
            }
        }
        catch (InterruptedException ex) {
            System.out.println("Main interrupted");
        }
    }
}
