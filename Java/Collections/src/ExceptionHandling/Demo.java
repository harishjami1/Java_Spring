package ExceptionHandling;

import java.io.IOException;

public class Demo {
    void getter() throws ArithmeticException{
        System.out.println("Getter");
    }

}
class Demo2 extends Demo{
    @Override
    void getter() throws ArithmeticException {//Not Parent Exception
        System.out.println("Sub Getter");
    }

    public static void main(String[] args) {
        Demo d= new Demo();
        Demo2 d1= new Demo2();
        d.getter();
        d1.getter();
    }
}
