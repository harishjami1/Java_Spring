package Close;

import java.io.Closeable;

class Test implements Closeable{
    public void close(){
        System.out.println("Closed the resource");
    }
}
public class Main {
    public static void main(String[] args) {
        try(Test t1 = new Test();
            ){
            int x= 10/0;
        }
        catch(ArithmeticException e)
        {
            e.printStackTrace();
        }
        finally{
            System.out.println("Executed Finally");
        }
    }
}
