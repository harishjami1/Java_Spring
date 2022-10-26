package Clone;
class Emp1 implements Cloneable{
    int k=14;

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
public class Deep {
    public static void main(String[] args) throws CloneNotSupportedException {
        Emp1 e1= new Emp1();
        //e1.k=14;
        Emp1  e2 = (Emp1) e1.clone();
       // e2=e1;Shallow Copy
       // e2.k=12;
        System.out.println(e1.k);
        System.out.println("HC1"+e1.hashCode()+" HC2"+e2.hashCode());
        System.out.println(e2.equals(e1));
    }
}
