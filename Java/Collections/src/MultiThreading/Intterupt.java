package MultiThreading;

public class Intterupt extends Thread{
    public void run(){
        System.out.println(Thread.currentThread().isInterrupted());
      //  System.out.println(Thread.interrupted());//Returns status and Chnages to false if true
        System.out.println(Thread.currentThread().isInterrupted());
        try {for(int i=0;i<5;i++){
           // Thread.sleep(1000);
            System.out.println("Thread is prining"+i);}
        } catch (Exception e) {
            e.printStackTrace();
        }
        finally {
            System.out.println("Ran the finally");
        }

    }

    public static void main(String[] args) {
        Intterupt th = new Intterupt();
        th.start();
        th.interrupt();

    }
}
