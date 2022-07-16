module uz.jpms.core {
    uses uz.jpms.notification.Notifier;
    requires uz.jpms.logging;
    requires uz.jpms.notification;
    requires uz.jpms.smsnotification;
    requires uz.jpms.mailnotification;

    exports uz.jpms.core.service;
    exports uz.jpms.core.dao;
    exports uz.jpms.core.domain;
    exports uz.jpms.core.domain.user;
    exports uz.jpms.core.domain.book;
}