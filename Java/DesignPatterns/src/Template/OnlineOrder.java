package Template;

import java.sql.SQLOutput;

public class OnlineOrder extends OrderTemplate{
    @Override
    public void doSelect() {
        System.out.println("Item added to cart");
        System.out.println("Provided Delivery  address");
    }

    @Override
    public void doPayment() {
        System.out.println("Paid through UPI/Online Banking");
    }

    @Override
    public void doDelivery() {
        System.out.println("Delivered to provided address");
    }
}
