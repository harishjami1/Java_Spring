package Streams;

import java.awt.*;
import java.util.*;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class one {
    public static void main(String[] args) {


    List<Integer> list =   Arrays.asList(1, 2,2,3, 3, 4, 5, 6, 7);
        
        Set<Integer> set3 =list.stream().distinct().collect(Collectors.toSet());
        set3.forEach(k-> System.out.println(k+":"+Collections.frequency(list,k)));
        System.out.println(list.stream().reduce((a,b)->a+b).get());
        System.out.println("Product "+list.stream().reduce((a,b)->a*b).get());
        System.out.println(list.stream().mapToInt(x->x).summaryStatistics().getMax());
        System.out.println(list.stream().mapToInt(x->x).summaryStatistics().getSum());
        System.out.println("Last Elemnet"+list.stream().reduce((a,b)->b).get());
    Set<Integer> hset = list.stream().filter(x-> Collections.frequency(list,x)>1).collect(Collectors.toSet());
    for(Integer t : hset){
        System.out.println(t);
    }
        System.out.println("Count");
        System.out.println(list.stream().filter(x->x==2).count());
      //  list.stream().sorted(Collections.reverseOrder()); //Reverse a stream
        System.out.println("Generate a list");
        List<Integer> li =list.stream().collect(Collectors.toList());
        ArrayList<Integer> al = new ArrayList<>(li);
        System.out.println("Infinite Stream of double");
       // DoubleStream.iterate(1.2,i-> i+1.23).forEach(x-> System.out.println(x));
        System.out.println("Infinite Int stream");
       // IntStream.iterate(1,i->i+1).forEach(x-> System.out.println(x));
        System.out.println("Convert String to list of chars");
        String str = "NewSTring";
        List<Character> lc=str.chars().mapToObj(e-> (char)e).collect(Collectors.toList());
        System.out.println(lc);
    }
}
