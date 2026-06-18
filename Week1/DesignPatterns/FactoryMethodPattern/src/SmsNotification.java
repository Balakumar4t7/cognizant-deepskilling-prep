public class SmsNotification implements Notification{
    @Override
    public String send() {
        return "Message through SMS !";
    }
}
