public class Add {
    Calculate calculate;
    Add(Calculate calculate){
        this.calculate= calculate;
    }
    public int calc(int a , int b){
        return a+b;
    }
    public int adder(int a ,int b){
        return calculate.calc(a,b);
    }

    public static void main(String[] args) {
        Calculate calc = null;
        Add a = new Add(calc);
       int result = a.calc(3,5);
        System.out.println(result);
    }
}
