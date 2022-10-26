package Streams;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.IntPredicate;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Test {
    public static void main(String[] args) {
        int arr[] = {5,3,21,1,5,7,9,5,2,4,5,7};
        String str[] = {"Thank you"," Hi There"," Okay now"};

        Optional<String> opstr = Arrays.stream(str).reduce((first,second)->first+"-"+second);
        if(opstr.isPresent()){
            System.out.println(opstr);
        }
        //IntStream.of(arr).sorted().skip(arr.length-3).forEach(System.out::println);Max 3
       // IntStream.of(arr).distinct().sorted().limit(3).forEach(System.out::println);//Min 3
        IntStream.of(arr).filter(n-> n%2==1).forEach(System.out::println);
        Arrays.stream(arr).filter(k->k%2==0).forEach(k-> System.out.println(k));
        Arrays.stream(str).forEach(k->System.out.println(k));
    }
}
