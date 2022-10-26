package Temp;
import java.util.*;
import java.lang.*;
import java.util.stream.Stream;

public class LastThree {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,4,2,5,7,9,4,6,3,9,3,5,3,8,6,6,2,3);
       // Stream<Integer> stream = Stream.of(list);
     //   Collections.sort(list,Collections.reverseOrder());
        list.forEach(k-> System.out.print(k));
        System.out.println();
        list.stream().distinct().sorted(((o1,o2)-> o2.compareTo(o1))).limit(3).forEach(i-> System.out.print(i+"\t"));
    }
}
