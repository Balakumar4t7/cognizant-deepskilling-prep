//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        NotificationFactory nf = new EmailFactory();
         Notification notification= nf.createNotification();
        System.out.println(notification.send());

        nf= new SmsFactory();
        notification= nf.createNotification();
        System.out.println(notification.send());

    }
}