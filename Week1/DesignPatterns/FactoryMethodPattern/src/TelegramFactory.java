public class TelegramFactory extends NotificationFactory{
    @Override
    public Notification createNotification() {
        return new SmsNotification();
    }
}
