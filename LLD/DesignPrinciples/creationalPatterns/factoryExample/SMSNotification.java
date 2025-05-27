package creationalPatterns.factoryExample;

public class SMSNotification implements Notification{

    @Override
    public void notifyUser() {
        System.out.println("SMS notification is sent to user!");
    }
}
