package Practice;

import java.util.*;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.stream.Collectors;

public class listitr {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(23);
        list.add(46);
        list.add(32);
        list.add(1,24);
      //  list.remove("24");
       list.stream().sorted(Comparator.reverseOrder()).forEach(k-> System.out.println(k));
        list.removeIf(x->x.equals(24));
        TreeSet<Integer> set = new TreeSet<>(list);

        TreeMap<Integer,Integer> tmap = new TreeMap<>();
        tmap.put(1,2);
        tmap.entrySet().forEach(k-> System.out.println(k));
        for(Map.Entry<Integer,Integer> map: tmap.entrySet()){
            System.out.println(map.getKey());
        }
        CopyOnWriteArrayList<Integer> list2 = new CopyOnWriteArrayList<>(list);
       // Collections.sort(list);
        Collections.sort(list,Comparator.reverseOrder());

        ListIterator<Integer> itr =list.listIterator(list.size());
       while(itr.hasPrevious()){
            System.out.println(itr.previous());
          //  list.add(25);
        }
    }
}
