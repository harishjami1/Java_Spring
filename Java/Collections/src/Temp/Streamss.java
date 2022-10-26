package Temp;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;
import java.util.stream.Collectors;

public class Streamss {
    public static void main(String[] args) {
        String str ="ab,bbba,ab,a,bb,ba,bb,ba,a,bbba,w,r,t,";
        HashMap<String,Integer> hmap = new HashMap<>();
        String[] strarr = str.split(",");
        List<String> list = Arrays.asList(strarr);
        Set<String> hsett = list.stream().distinct().collect(Collectors.toSet());
        System.out.println("New Freq");
        hsett.forEach(k->System.out.println(k +":"+Collections.frequency(list, k)));
        for(int i=0;i< strarr.length;i++){
           // System.out.println(strarr[i]);
            if(hmap.containsKey(strarr[i])){
                hmap.put(strarr[i],hmap.get(strarr[i])+1);
            }
            else
                hmap.put(strarr[i],1);
        }
        System.out.println(hmap.values());
        ConcurrentHashMap<String,Integer> conc = new ConcurrentHashMap<>(hmap);
        Enumeration enumeration = conc.keys();

        while(enumeration.hasMoreElements()){
            System.out.println(enumeration.nextElement());
        }
        conc.keySet().forEach(k-> System.out.println(k));

     //   hmap.forEach((k,v)-> System.out.println(k+" "+v));
       // hmap.entrySet().forEach(k-> System.out.println(k.getKey()+" "+k.getValue()));
    }
}
