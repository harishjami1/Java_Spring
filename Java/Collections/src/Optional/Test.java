package Optional;

import java.util.Arrays;
import java.util.Optional;

public class Test {
    public static void main(String[] args) {
        String []str1 = {"I am fine","How are you","You are cute","Are you fine","What are these"};
        String str = "It is okay";
        Optional  opt =Optional.of("Test STring");
        Optional opt1 = Optional.ofNullable(null);
        System.out.println(opt1.isPresent());
       Arrays.stream(str1).filter(n->n.length() >20).forEach(System.out::println);

    }
}
