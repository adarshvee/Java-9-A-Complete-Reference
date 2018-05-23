/*
 * This class shows a deadlock condition. Need to exit manually.
Force deadlock using sleep
 */
package Chapter11;

/**
 *
 * @author Adarsh V
 */
public class DeadlockDemo implements Runnable {
    
    A a = new A();
    B b = new B();
    DeadlockDemo() {
        Thread.currentThread().setName("Main thread");
        Thread t = new Thread(this, "Racing thread");
        t.start();
        
        a.foo(b); // get a lock on a in main thread
    }
    public void run() {
        b.bar(a); // Get a lock on b in second thread
        System.out.println("Race thread");
    }
    
    public static void main(String[] args) {
        new DeadlockDemo();
    }
}

class A {
    synchronized void foo (B b) {
        String name = Thread.currentThread().getName();
        
        System.out.println(name + "entered A.foo");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException ex) {
            System.out.println("A interrupted");
        }
        
        System.out.println(name + " trying to call B.last()");
        b.last();
    }
    
    synchronized void last() {
        System.out.println("Chapter11.A.last");
    }
}

class B {
    synchronized void bar (A b) {
        String name = Thread.currentThread().getName();
        
        System.out.println(name + "entered B.bar");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException ex) {
            System.out.println("B interrupted");
        }
        
        System.out.println(name + " trying to call A.last()");
        b.last();
    }
    
    synchronized void last() {
        System.out.println("Chapter11.B.last");
    }
}
