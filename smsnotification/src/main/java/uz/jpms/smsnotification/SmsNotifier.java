package uz.jpms.smsnotification;

import uz.jpms.notification.Notifier;

public class SmsNotifier implements Notifier {
    @Override
    public void sendMessage() {
        System.out.println("Sending sms...");
    }
}
