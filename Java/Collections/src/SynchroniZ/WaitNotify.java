package SynchroniZ;

class Thread1 extends Thread{
    int k=0;
    public void run()
    {
        synchronized (this){for(int i=0;i<100;i++){
            k+=10;
        }
        System.out.println(k);
        this.notify();
    }}
}


public class WaitNotify {
    public static void main(String[] args) {
        Thread1 t = new Thread1();
        t.start();
        synchronized (t){
            try {
                t.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println(t.k);
    }

}
