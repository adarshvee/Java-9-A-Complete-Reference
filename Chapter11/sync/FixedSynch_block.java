/*
 * This class demonstrates the danger of not Synchronizing threads properly
 */
package Chapter11.sync;

/**
 *
 * @author Adarsh V
 */

class CallMe {
     void call(String msg) {
        System.out.print(Thread.currentThread().getName() + "[" + msg);
        try {
            Thread.sleep(1000);
            
        } catch (InterruptedException ex) {
            System.out.println("Interrupted");
        }
        System.out.println("]" + Thread.currentThread().getName());
    }
}

class Caller implements Runnable {
    String msg;
    CallMe target;
    Thread t;
    
    public Caller(CallMe targ, String s) {
        target = targ;
        msg = s;
        t = new Thread(this);
        t.setName(s);
        t.start();
    }
    
    public void run(){
        synchronized (target) {
            target.call(msg);
        }
    }
}
public class FixedSynch_block {
    public static void main(String[] args) {
        CallMe target = new CallMe();
        Caller obj1 = new Caller(target, "Hello");
        Caller obj2 = new Caller(target, "Synchronized");
        Caller obj3 = new Caller(target, "World");
        
        try {
            obj1.t.join();
            obj2.t.join();
            obj3.t.join();
        } catch (InterruptedException ex) {
            System.out.println("Main thread join error");
        }
    }
}
