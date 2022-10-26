package Practice;

public class Deadlock {
    public static void main(String[] args) {
       final String str1 = "str1";
      final  String str2 = "str2";
        Thread t1 = new Thread(){
            public void run(){
                synchronized (str1){
                    System.out.println("Thread 1 str1 Locked");
                   try{ Thread.sleep(2000);}
                   catch(Exception e){
                       e.printStackTrace();
                   }

                synchronized (str2){
                    System.out.println("Thread 1 in str2");
                }}
            }
        };
        Thread t2 = new Thread(){
            public void run(){
                synchronized (str2){
                    System.out.println("Thread 2 str2 Locked");
                    try{ Thread.sleep(2000);}
                    catch(Exception e){
                        e.printStackTrace();
                    }

                synchronized (str1){
                    System.out.println("Thread 1 in str2");
                }}
            }
        };
        t1.start();
        t2.start();
    }
}
