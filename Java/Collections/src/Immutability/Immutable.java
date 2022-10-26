package Immutability;



final class Immutable {
    private final int k;
    private final String name;
    Immutable(int k,String name){
        this.k=k;
        this.name=name;
    }
    public int getK() {
        return k;
    }
    public String getName() {
        return name;
    }

    public static void main(String[] args) {
        Immutable m1 = new Immutable(13,"NoName");
        Immutable m2 = new Immutable(14,"Some");
       // m1.k=13; //Throws error as k is final
        //m1=m2; Shallow copy
        System.out.println(m1.getK()+" "+m1.getName());
        System.out.println(m2.getK()+" "+m2.getName());
    }
}
