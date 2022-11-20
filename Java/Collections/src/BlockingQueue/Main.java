package BlockingQueue;


 class BlockingQueue {
    static int []bq = new int[10];
    int front=0,back=0,count=0;
    synchronized void put(int x) throws InterruptedException
    {
        while(count==bq.length)
        {wait();System.out.println("Waiting");}
        bq[front]=x;
        front++;
        System.out.println("Added");
        if(front==bq.length)
        front=0;
        count++;
        notifyAll();
    }
    synchronized int take() throws InterruptedException{
        while(count==0)
        {   System.out.println("Waiting");
            wait();}
        int x=bq[back];
        back++;
        System.out.println("Removed");
        if(back==bq.length)
        back=0;
        count--;
        notifyAll();
        return x;

    }}
    public class Main{
    public static void main(String[] args) throws InterruptedException {
        BlockingQueue bq = new BlockingQueue();        BlockingQueue bq1 = new BlockingQueue();

        bq.take();
        bq1.put(6);

    }
}
