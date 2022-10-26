package Temp;

import java.util.*;

public class TwoDarr {
    public static void main(String[] args) {
        Map<Integer,Integer> map = new HashMap<Integer, Integer>();
        List<Integer> list = Arrays.asList(1,1,3,2,3,4,5,4,3,1);
        for(int i=0;i<list.size();i++){
            if(map.get(list.get(i))!=null){
                map.put(list.get(i),map.get(list.get(i))+1);
            }
            else
               map.put(list.get(i),1);
        }
        Set<Integer> set = new HashSet<>(list);
        System.out.println(set);

    }
}
