package collec;

import java.util.*;

public class TraverseExp {
    public static void main(String[] args) {
        ArrayList<String> list  = new ArrayList<>();

        list.add("Hyderabad");
        list.add("Vizag");
        list.add("vjwd");
        //Iterable
        System.out.println("Iterable ---------------------------");
        for(String str: list)
        {
            System.out.println(str);
            StringBuffer sb = new StringBuffer(str);;
            System.out.println(sb.reverse());
         //   System.out.println(sb.append("-Reversed"));
            System.out.println("Caacity"+sb.capacity());

        }
        //Iterator
        System.out.println("Iterator --------------------");
        Iterator itr = list.iterator();
        while(itr.hasNext())
        {
            System.out.println(itr.next());
        }
        //ListIterator for backward
        System.out.println("ListIterator Back----------------");
        ListIterator itr1 = list.listIterator(list.size());//For Backward Traversal
        while(itr1.hasPrevious())
        {
            System.out.println(itr1.previous());
        }

        //Enum
        System.out.println("Vector using Enum");
        Vector<String> vect = new Vector<>(list);
        Enumeration enumeration = vect.elements();
        while(enumeration.hasMoreElements()){
            System.out.println(enumeration.nextElement());
        }

        //for_each()
        System.out.println("for_each-----------");
        list.forEach(e->{
            System.out.println(e);
        });

    }

}
