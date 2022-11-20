class A{
    int p=10;;
    void m1(){
        System.out.println("Normal m1");
    }
    void m1(int k){
        System.out.println("Param m1");
    }
}
class B extends A{
    int p=20;
    void m1()
    {
System.out.println("Normal m1 in B");
    }
    void m1(int k)
    {
        System.out.println("Param m1 in B");
    }
    void m2(){
        System.out.println("m2");
    }
}

public class Main {
    public static void main(String[] args) {
        A a = new A();
        A a1 = new B();
        B b = new B();
    //    B b1= new A(); Not Supported
        a.m1();// ((B)a).m2(); Cannot Cast to SubClass
        a1.m1(9);((B) a1).m2();
        b.m1();b.m2();
        System.out.println(a.p+" "+a1.p+" "+b.p);
    }
}
