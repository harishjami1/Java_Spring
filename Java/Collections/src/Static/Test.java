package Static;
class Emp{
    static int k=90;

}
public class Test {
    public static void main(String[] args) {
       Emp p=new Emp();
       Emp y=new Emp();
      p.k=13;
        System.out.println(p.k+" "+y.k);
    }
}
