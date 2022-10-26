package Reentrant;

import java.util.concurrent.locks.ReentrantLock;

public class Reentrant {
    public static ReentrantLock lock = new ReentrantLock(true);
    static void accessResource(){

        boolean lockAcquired = lock.tryLock();
        if(lockAcquired){
        try{
        System.out.println("Current Thread is "+10/0);}
        finally{
            System.out.println("Entered Finally block");
       // lock.unlock();
         lock.unlock();}}
        else
        {
            System.out.println("Skipped locked part for now by "+Thread.currentThread().getName());
        }
    }

    public static void main(String[] args) {
        Thread t1 = new Thread(()-> accessResource() );
        Thread t2 = new Thread(()-> accessResource() );
        Thread t3 = new Thread(()-> accessResource() );
        t1.start();
        t2.start();
        t3.start();

    }

}
