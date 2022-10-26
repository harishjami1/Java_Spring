package Comp;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Laptop implements Comparable<Laptop>{
    private int ram;
    private int price;
    private String name;
    Laptop(int ram,int price,String name){
        this.price=price;
        this.ram=ram;
        this.name=name;
    }
    public int getPrice() {
        return price;
    }

    public int getRam() {
        return ram;
    }

    public String getName() {
        return name;
    }

    public String toString(){
        return "Name:"+this.getName()+"Ram:"+this.getRam()+" Price"+this.getPrice();
   }
    @Override
    public int compareTo(Laptop l) {
        return this.getName().compareTo(l.getName());

    }
}
public class Able {
    public static void main(String[] args) {
        List<Laptop> l = new ArrayList<>();


         l.add(new Laptop(8,300,"Dell"));
        l.add(new Laptop(4,200,"Hp"));
        l.add(new Laptop(16,500,"Apple"));

        Collections.sort(l);
        System.out.println(l);
        for(Laptop la:l){
            System.out.println(la);
        }
    }
}
