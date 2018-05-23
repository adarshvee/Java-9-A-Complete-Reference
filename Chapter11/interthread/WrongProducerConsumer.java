/*
 * This class demonstrates a wrong implementation of Producer/Consumer queue
that does not use threads. P is the Producer, Q 
 */
package Chapter11.interthread;

/**
 *
 * @author Adarsh V
 */
public class WrongProducerConsumer {
    public static void main(String[] args) {
        RQ q = new RQ();
        new RProducer(q);
        new ConsumeRr(q);
    
        System.out.println("Press control-c to stop");
    }
    
}

class RQ {
    int n;
    
    synchronized int get() {
        System.out.println("Got " + n);
        return n;
    } 
    
    synchronized void put(int n) {
        this.n = n;
        System.out.println("Put : " + n);
    }
}

class RProducer implements Runnable {
    RQ q;
    
    RProducer (RQ q) {
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

class ConsumeRr implements Runnable {
    RQ q;
    
    ConsumeRr (RQ q) {
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
