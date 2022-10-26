package Template;

public class Main {
    public static void main(String[] args) {
        OrderTemplate onlineorder = new OnlineOrder();
        OrderTemplate storeorder = new StoreOrder();
        onlineorder.ProcessOrder(true);
        System.out.println();
        storeorder.ProcessOrder(false);
    }
}
