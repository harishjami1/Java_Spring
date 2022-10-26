package StringBuilderBuffer;

public class Main {
    public static void main(String[] args) {
    
        String str= "Name";
        StringBuilder s= new StringBuilder(str);
        StringBuffer s1= new StringBuffer(str);
        s1.deleteCharAt(2);
        s.append("Salary");
        s.reverse();
        System.out.println(s.toString());System.out.println( s1.toString());
    }
}
