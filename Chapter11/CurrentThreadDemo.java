/*
 *This program demonstrates how to obtain and manipulate the Main thread
 */
package Chapter11;

/**
 *
 * @author Adarsh V
 */
public class CurrentThreadDemo {
    public static void main(String[] args) {
        Thread t = Thread.currentThread();
        System.out.println("Current thread " + t);
        
        t.setName("My Thread");
        System.out.println("After changing name " + t);
        
        try {
            for (int n = 5; n>0; n--) {
                System.out.println(n);
                Thread.sleep(1000);
                } 
            }
            catch (InterruptedException ex) {
                System.out.println("Main thread interrupted");
            }
        }
 }
    
