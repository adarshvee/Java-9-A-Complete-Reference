/*
 * This class demonstrates a wrong implementation of Producer/Consumer queue
that does not use threads. P is the Producer, Q 
 */
package Chapter11.interthread;

/**
 *
 * @author Adarsh V
 */
public class ProducerConsumer {
    public static void main(String[] args) {
        Q q = new Q();
        new Producer(q);
        new Consumer(q);
    
        System.out.println("Press control-c to stop");
    }
    
}

class Q {
    int n;
    boolean valueSet = false;
    synchronized int get() {
        while (!valueSet) {
            try {
                wait();
            }
            catch(InterruptedException ex) {
                System.out.println("Interrupted Exception");
            }
        } 
        System.out.println("Got " + n);
        valueSet = false;
        notify();
        return n;
    } 
    
    synchronized void put(int n) {
        while (valueSet) {
            try {
                wait();
            }
            catch(InterruptedException ex) {
                System.out.println("Interrupted Exception");
            }
        }         
        this.n = n;
        valueSet = true;
        notify();
        System.out.println("Put : " + n);
    }
}

class Producer implements Runnable {
    Q q;
    
    Producer (Q q) {
        this.q = q;
        new Thread(this, "Producer").start();
    }
    
    public void run() {
        int i = 0;
        while (true) {
            q.put(i++);
        }
    }
}

class Consumer implements Runnable {
    Q q;
    
    Consumer (Q q) {
        this.q = q;
        new Thread(this, "Consumer").start();
    }
    
    public void run() {
        int i = 0;
        while (true) {
            q.get();
        }
    }
}
