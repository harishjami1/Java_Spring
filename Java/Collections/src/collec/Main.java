package collec;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World");
        //Type Safe
        ArrayList<String> names = new ArrayList<>();
        names.add("Harish");
        names.add("Jami");
        names.add("Hyderabad");
        names.remove("Hyderabad");
        names.remove(1);
        names.add(0,"Insert");
        names.set(0,"replace");
       // names.add(3);//Gives Error
    //    System.out.println(names.get(1));
        System.out.println(names+" "+names.size()+" "+names.isEmpty()+" "+names.contains("replace"));
        //Untype Safe
        LinkedList list = new LinkedList();
        list.add("New");
        list.add(13);
        list.add(true);
        list.remove(1);
        System.out.println(list);


        //Vector

        Vector<String> vect = new Vector<>();
        vect.addAll(names);
        System.out.println(vect);

        //Hashset               Not ordered and not sorted
        HashSet<Double> hset = new HashSet<>();
        hset.add(12.3);
        hset.add(46.3);
        hset.add(46.3); //No Duplicates Allowed
        hset.add(23.6);//No need to pass wrapper class as it is default
        System.out.println("HshSet"+hset);
        //Tree set                 Sorted
        TreeSet<Double> tset = new TreeSet<>(hset);
        System.out.println(tset);


    }
}
