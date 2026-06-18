public class EmailNotification implements Notification{
    @Override
    public String send() {
        return "Message through Email !";
    }
}
