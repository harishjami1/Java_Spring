package FactoryMethod;

public class NotificationFactory {


    public static Notification createNotification(String str){
        switch(str){
            case "SMS" :
               return new SMSNotification();
            case  "Email":
                return new EmailNotification();
            case "Push":
                return new PushNotification();
            default:
                throw new IllegalArgumentException("Enter SMS or Email or Push.Entered :"+str);
            }
        }

    }

