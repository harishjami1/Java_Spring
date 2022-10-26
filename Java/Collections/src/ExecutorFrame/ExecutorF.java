package ExecutorFrame;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.*;

public class ExecutorF {
    public static void main(String[] args) {
       // int coreCount = Runtime.getRuntime().availableProcessors(); //For CPUIntense tasks
        //For Synchronous Queue

       // System.out.println("No. of processors"+coreCount);
      //  ExecutorService exec = Executors.newFixedThreadPool(coreCount);
        ScheduledExecutorService exec1 = Executors.newScheduledThreadPool(10);
        ExecutorService exec2 = Executors.newSingleThreadExecutor();
        exec1.schedule(new Task(),12,TimeUnit.SECONDS);

        exec1.scheduleAtFixedRate(new Task(),10,20,TimeUnit.SECONDS);
        exec1.scheduleWithFixedDelay(new Task(),10,10,TimeUnit.SECONDS);
        ExecutorService exec4 = Executors.newWorkStealingPool();
        ExecutorService exec =Executors.newCachedThreadPool();
        for(int i=0;i<100;i++)
        {
        exec4.execute(new Task());
        }
        System.out.println("Thread running is:"+ Thread.currentThread().getName());
        exec1.shutdown();
        exec.shutdown();
        exec2.shutdown();
        exec4.shutdown();
    }
    static class Task implements Runnable {
        public  void run()
        {
            System.out.println("Thread is running "+Thread.currentThread().getName());
        }
    }
}

