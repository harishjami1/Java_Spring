package Practice;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

class Task1 implements  Runnable{
    CyclicBarrier cyclicBarrier;
    Task1(CyclicBarrier cyclicBarrier){
        this.cyclicBarrier= cyclicBarrier;
    }
    @Override
    public void run() {
        try {
            System.out.println("Entered Run");
            cyclicBarrier.await();
            System.out.println("Count Decreased");
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (BrokenBarrierException e) {
            e.printStackTrace();
        }
    }
}

public class Barrier {
    public static void main(String[] args) {
        CyclicBarrier cb = new CyclicBarrier(2);
        new Thread(new Task1(cb)).start();
        new Thread(new Task1(cb)).start();
        System.out.println("In "+Thread.currentThread().getName());
    }
}
