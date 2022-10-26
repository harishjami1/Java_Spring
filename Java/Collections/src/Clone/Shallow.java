package Clone;
class Emp{
    int k;

}

public class Shallow {
    public static void main(String[] args) {


    Emp e1= new Emp();
    Emp e2 =e1;
    e1.k=13;
    e2=e1;
    e2.k=7;
        System.out.println(e1.equals(e2)+Integer.toString(e1.k));
        System.out.println(" "+e1.k);
}
}
