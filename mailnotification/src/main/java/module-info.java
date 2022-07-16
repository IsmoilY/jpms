module uz.jpms.mailnotification {

    requires uz.jpms.notification;
    provides uz.jpms.notification.Notifier with uz.jpms.mailnotification.EmailNotifier;

}