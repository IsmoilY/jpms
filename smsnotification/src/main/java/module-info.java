module uz.jpms.smsnotification {

    requires uz.jpms.notification;
    provides uz.jpms.notification.Notifier with uz.jpms.smsnotification.SmsNotifier;

}