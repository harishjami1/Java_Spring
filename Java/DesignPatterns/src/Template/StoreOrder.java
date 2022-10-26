package Template;

public class StoreOrder extends OrderTemplate {
    @Override
    public void doSelect() {
        System.out.println("Items selected from the shelf");
    }

    @Override
    public void doPayment() {
        System.out.println("Paid the amount at the counter");
    }

    @Override
    public void doDelivery() {
        System.out.println("Delivered the items at the counter");
    }
}
