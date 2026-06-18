public class SmsFactory extends NotificationFactory{
    @Override
    public Notification createNotification() {
        return new SmsNotification();
    }
}
