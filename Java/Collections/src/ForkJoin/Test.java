package ForkJoin;

import java.lang.*;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.RecursiveTask;

public class Test extends RecursiveTask<Integer> {
    final int n;
    Test(int n){
        this.n=n;
    }
    @Override
    protected Integer compute() {
        if(n<=1){
        return n;}
        Test t1 = new Test(n-1);
        Test t2 = new Test(n-2);
        t1.fork();
        t2.fork();
        return t1.invoke()+t2.invoke();
    }



    public static void main(String[] args) {

        ForkJoinPool fjp = new ForkJoinPool().commonPool();

        Test t = new Test(6);

        int result = fjp.invoke(t);
        System.out.println("Result is "+ result);

    }
}
