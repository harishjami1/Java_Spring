package Callable;

import java.util.Random;
import java.util.concurrent.*;

public class Task implements Callable {
    @Override
    public Object call() throws Exception {
        return new Random().nextInt();
    }

    public static void main(String[] args) {
        ExecutorService exec = Executors.newFixedThreadPool(10);
        for(int i=0;i<20;i++){

        Future<Integer> future = exec.submit(new Task());

            try {
                int result = future.get();
                future.get(1,TimeUnit.SECONDS);
                System.out.println(result);
            } catch (InterruptedException e) {
                e.printStackTrace();
            } catch (ExecutionException e) {
                e.printStackTrace();
            } catch (TimeoutException e) {
                e.printStackTrace();
            }}
            exec.shutdown();
        //CompletableFuture.supplyAsync(() -> new Task())
        //        .thenApply(new Task())
          //      .exceptionally()
         System.gc();


    }}

