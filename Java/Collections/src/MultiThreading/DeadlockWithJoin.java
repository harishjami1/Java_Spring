package MultiThreading;

public class DeadlockWithJoin extends Thread {
    static Thread mainThread;
    public void run() {
        try {
            mainThread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        try {for(int i=0;i<5;i++){
            System.out.println("New Thread"+Thread.currentThread().getName());
            Thread.sleep(1300);}
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

    public static void main(String[] args) {

        DeadlockWithJoin s1 = new DeadlockWithJoin();
        DeadlockWithJoin s2 = new DeadlockWithJoin();
        mainThread = Thread.currentThread();
        s1.start();
        try {
            s1.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        //  s2.start();
        try {for(int i=0;i<5;i++){
                System.out.println(" main");
                Thread.sleep(1000);}}
             catch (InterruptedException e) {
                e.printStackTrace();}
            }

}
