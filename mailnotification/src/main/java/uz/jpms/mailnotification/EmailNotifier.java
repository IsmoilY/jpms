package uz.jpms.mailnotification;

import uz.jpms.notification.Notifier;

public class EmailNotifier implements Notifier {
    @Override
    public void sendMessage() {
        System.out.println("Sending mail...");
    }
}
