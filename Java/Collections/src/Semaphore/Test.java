package Semaphore;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;

public class Test {


    public static void main(String[] args) {
        Semaphore sem = new Semaphore(3,true);
        ExecutorService exec = Executors.newCachedThreadPool();
        for(int i=0;i<10;i++)
        {
            exec.execute(new Test1(sem));

        }
        try {
            exec.awaitTermination(1, TimeUnit.MINUTES);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        exec.shutdown();
    }
    static class Test1 implements Runnable{
        Semaphore sem;
        Test1(Semaphore sem)
        {
            this.sem=sem;
        }
        @Override
        public void run() {
            try {
                sem.acquire();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName());
          sem.release();
        }
    }
}
