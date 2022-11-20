package Comp;

import java.util.*;

class Laptop1{
    private Integer ram;
    private int price;
    Laptop1(Integer ram,int price){
        this.price=price;
        this.ram=ram;
    }
    public int getPrice() {
        return price;
    }

    public Integer getRam() {
        return ram;
    }

    public String toString(){
        return "Ram:"+this.getRam()+" Price"+this.getPrice();
    }}
public class Rator {
    public static void main(String[] args) {
        List<Laptop1> l = new ArrayList<>();


        l.add(new Laptop1(8,300));
        l.add(new Laptop1(8,250));
        l.add(new Laptop1(4,200));
        l.add(new Laptop1(16,500));
        Comparator<Laptop1>  l1 = (o1,o2)-> o1.getRam().compareTo(o2.getRam());
        Comparator<Laptop1> priceComparator = (o1,o2)-> o1.getPrice()-o2.getPrice();
        Optional opt = Optional.of(" ");
        System.out.println(opt.isPresent());
        if(opt.isPresent()){
            System.out.println(opt);
        }
        opt.ifPresent(System.out::println);
        Collections.sort(l,l1);
        //Collections.sort(l,priceComparator);
        Collections.sort(l, new Comparator<Laptop1>() {
            @Override
            public int compare(Laptop1 o1, Laptop1 o2) {
                return o1.getRam().compareTo(o2.getRam());
            }
        });
        for(Laptop1 la:l){
            System.out.println(la);
        }
    }
}
