package Streams;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class neww{
    public static void main(String[] args) {
        List<Integer> myList = Arrays.asList(10,15,8,49,25,98,98,32,15);
        String input = "Java Hungry Blog Alive is Awesome";
        List<Character> list = input.chars().mapToObj(k->(char)k).collect(Collectors.toList());
         System.out.println( myList.stream().distinct().filter(k->Collections.frequency(myList,k)==1).findFirst());
         System.out.println( input.chars().mapToObj(k->(char)k).distinct().filter(k-> Collections.frequency(list,k)==1).findFirst().get());
    }
}