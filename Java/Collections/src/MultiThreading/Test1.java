package MultiThreading;

public class Test1 extends Thread{
    public void run(){

        System.out.println("Exec,uting.."+Thread.currentThread().getPriority());

    }

    public static void main(String[] args) {
        System.out.println("Main Thread");
        //Thread.currentThread().setPriority(1);
        Test1 t2 = new Test1();
        Test1 t1 = new Test1();
        t1.setDaemon(true);
        t2.setDaemon(true);
        t2.start();
        t1.start();
        System.out.println(Thread.currentThread().getPriority());

    }
}
