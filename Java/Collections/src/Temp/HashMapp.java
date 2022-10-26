package Temp;
import java.util.HashMap;
public class HashMapp {
    public static void main(String[] args) {
        HashMap<Integer,String> hmap = new HashMap<>();
        String str = hmap.getOrDefault(20,"Default");
        System.out.println(str.length());
    }
}
