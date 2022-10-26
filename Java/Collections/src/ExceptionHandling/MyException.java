package ExceptionHandling;
class CustException extends Exception{
    CustException(String str)
    {
        super(str);
    }
}

public class MyException{

     static  void Func() throws CustException{
        throw new CustException("Yes It Occured");
    }
    public static void main(String[] args) {
        try {
            Func();
        } catch (CustException e) {
            e.printStackTrace();
        }
    }
}