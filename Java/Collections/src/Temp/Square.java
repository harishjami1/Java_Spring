package Temp;
import java.util.*;
import java.util.stream.*;


public class Square {
    public static void main(String[] args) {
        List<Integer> arr = Arrays.asList(1,2,3,4,5,6,2,1,8,43,2,3,3,6);
        arr.stream().forEach(i-> System.out.println(i));
        arr.stream().map(i->i*i).collect(Collectors.toList()).forEach(i-> System.out.print(i+"\t"));

    }
}
