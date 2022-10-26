package MultiThreading;

 class Thread1 extends Thread{
    public void run(){
        System.out.println("Task 1 Id : "+Thread.currentThread().getName());
    }}
class Thread2 extends Thread{
    public void run(){
        System.out.println("Task 2 Id : "+Thread.currentThread().getName());
    }
       }
class Thread3 extends Thread{
    public void run(){
        System.out.println("Task 3 Id : "+Thread.currentThread().getName());
    }}

    class Test{

    public static void main(String[] args) {
        Thread1 t=new Thread1();
        t.setName("First");
        Thread2 t1=new Thread2();
        t1.setName("Second");
        Thread3 t2 = new Thread3();
        t2.setName("Third");
        t.start();
        t1.start();
        t2.start();
        System.out.println(Thread.currentThread().getName());
    }
}
