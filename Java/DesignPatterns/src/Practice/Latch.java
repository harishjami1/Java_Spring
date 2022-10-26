package Practice;
import java.util.concurrent.*;
class Task implements Runnable{
    CountDownLatch countDownLatch;
    Task(CountDownLatch countDownLatch){
        this.countDownLatch=countDownLatch;
    }
    public void run(){
        countDownLatch.countDown();
        System.out.println("Count Reduced");
        System.out.println(Thread.currentThread().getName());
    }
}
public class Latch {
    public static void main(String[] args) {
        CountDownLatch obj = new CountDownLatch(2);
        new Thread(new Task(obj)).start();
        new Thread(new Task(obj)).start();
       try{ obj.await();}
        catch (InterruptedException e) {
           e.printStackTrace();
       }
        System.out.println(Thread.currentThread().getName());
    }
}
