/*
 * This class demonstrates the danger of not Synchronizing threads properly
 */
package Chapter11.sync;

/**
 *
 * @author Adarsh V
 */

class CallMeNow {
    synchronized void call(String msg) {
        System.out.print(Thread.currentThread().getName() + "[" + msg);
        try {
            Thread.sleep(1000);
            
        } catch (InterruptedException ex) {
            System.out.println("Interrupted");
        }
        System.out.println("]" + Thread.currentThread().getName());
    }
}

class TheCaller implements Runnable {
    String msg;
    CallMeNow target;
    Thread t;
    
    public TheCaller(CallMeNow targ, String s) {
        target = targ;
        msg = s;
        t = new Thread(this);
        t.setName(s);
        t.start();
    }
    
    public void run(){
        target.call(msg);
    }
}
public class FixedSynch {
    public static void main(String[] args) {
        CallMeNow target = new CallMeNow();
        TheCaller obj1 = new TheCaller(target, "Hello");
        TheCaller obj2 = new TheCaller(target, "Synchronized");
        TheCaller obj3 = new TheCaller(target, "World");
        
        try {
            obj1.t.join();
            obj2.t.join();
            obj3.t.join();
        } catch (InterruptedException ex) {
            System.out.println("Main thread join error");
        }
    }
}
