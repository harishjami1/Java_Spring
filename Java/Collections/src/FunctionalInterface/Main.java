package FunctionalInterface;

import java.util.function.*;


public class Main {
    public static void main(String[] args) {

   Function<String,Integer> func1 = (k)-> k.length();
    Predicate<String> pred = (k)-> k.startsWith("H");
    Consumer<String> cons = (p)-> System.out.println(p);
    Supplier<String> supp = () -> "Amazed";
   // function<Integer,String> func = (k)->k.length();
    String str = "Hi";
        System.out.println(pred.test(str));
        cons.accept(str);
        System.out.println(supp.get());
        System.out.println(func1.apply(str));
    }
}
