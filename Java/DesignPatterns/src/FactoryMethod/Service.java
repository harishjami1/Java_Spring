package FactoryMethod;

public class Service {
    public static void main(String[] args) {
        NotificationFactory nf = new NotificationFactory();
        Notification notification= nf.createNotification("SMS");
        notification.notifyUser();
        notification = nf.createNotification("Push");
        notification.notifyUser();
    }
}
