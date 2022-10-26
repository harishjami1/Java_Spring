package Practice;

import java.util.*;

public class HashMapSortByValue {
    public static HashMap<Integer,Integer> sortByvalue(HashMap<Integer,Integer> hmap){
        List<Map.Entry<Integer,Integer >> list = new ArrayList<>(hmap.entrySet());
        Collections.sort(list, new Comparator<Map.Entry<Integer, Integer>>() {
            @Override
            public int compare(Map.Entry<Integer, Integer> o1, Map.Entry<Integer, Integer> o2) {
                return o1.getValue().compareTo(o2.getValue());
            }
        });
        HashMap<Integer,Integer> temp = new LinkedHashMap<>();
        for(Map.Entry<Integer,Integer> map : list){
            temp.put(map.getKey(),map.getValue());
        }


        return temp;
    }
    public static void main(String[] args) {
        HashMap<Integer,Integer> map = new HashMap<>();
        List<Integer> list = Arrays.asList(1,1,3,2,3,4,5,4,3,1);
        for(int i=0;i<list.size();i++){
            if(map.get(list.get(i))!=null){
                map.put(list.get(i),map.get(list.get(i))+1);
            }
            else
                map.put(list.get(i),1);
        }List<List<Integer>> ll =  new ArrayList<List<Integer>>();

       // hmap.put(22,"A");
       // hmap.put(55,"B");
      //  hmap.put(33,"Z");
      //  hmap.put(44,"M");
       // hmap.put(99,"I");
       // hmap.put(88,"X");
        Map<Integer,Integer> map1 = sortByvalue(map);
        for(Map.Entry<Integer,Integer> m1: map1.entrySet()){
            List<Integer> temp = new ArrayList<Integer>() ;
            temp.add(m1.getKey());
            temp.add(m1.getValue());

         //   System.out.println(temp);
            ll.add(temp);
           // ll.add
          //  System.out.println(ll);
       //    System.out.println(ll.get(0));

           // System.out.println(m1.getKey()+":"+m1.getValue());
        }
        System.out.println(ll);
       // System.out.println(ll.size());
       // ll.forEach(k-> System.out.println(k));
    }
}
