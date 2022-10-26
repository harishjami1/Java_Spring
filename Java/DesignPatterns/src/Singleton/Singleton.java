package Singleton;

import java.io.Serializable;

public class Singleton implements  Cloneable, Serializable {
    private static volatile Singleton obj;
    private Singleton(){

    }
    public static Singleton get_instance()
    {
        if(obj== null){
            synchronized (Singleton.class){
                if(obj==null)
                {
            obj = new Singleton();
                    System.out.println("New Object Created");}}
        }
        return obj;
    }
   // protected Object clone() throws CloneNotSupportedException{
   //     throw new CloneNotSupportedException();
   // }
   // protected Object readResolve(){
   //     return obj;
    //}

    public static void main(String[] args) {
       Singleton s = get_instance();
       Singleton s1 =get_instance();

    }
}
