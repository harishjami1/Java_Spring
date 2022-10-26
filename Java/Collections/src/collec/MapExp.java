package collec;

import java.util.Enumeration;
import java.util.*;
import java.util.HashMap;

public class MapExp {
    public static void main(String[] args) {
        HashMap<String,Integer> hmap = new HashMap<>();
        hmap.put("Hyderabad",500);
        hmap.put("Vizag",300);
         Set<String> set = hmap.keySet();
        System.out.println(set);
        set.stream().forEach(k-> System.out.println(k));
        System.out.println(hmap.get("Vizag"));
        hmap.forEach((k,v)->{
            System.out.println(k+":"+v);
        });

    }
}
