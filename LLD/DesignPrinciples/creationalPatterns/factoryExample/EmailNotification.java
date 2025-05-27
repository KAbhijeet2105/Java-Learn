package creationalPatterns.factoryExample;

public class EmailNotification implements Notification{
    @Override
    public void notifyUser() {
        System.out.println("Email notification sent to user!");
    }
}
