package Template;

public abstract class OrderTemplate {
    public boolean isGift;
    public abstract void doSelect();
    public  abstract void  doPayment();
    public abstract void doDelivery();
    public void Giftwrap()
    {
        System.out.println("Gift wrapped");
    }

    public void ProcessOrder(Boolean isGift)
    {
        doSelect();
        doPayment();
        if(isGift){
        Giftwrap();
    }
        doDelivery();

    }


}
