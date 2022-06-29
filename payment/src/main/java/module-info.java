module uz.jpms.payment {
    requires uz.jpms.logging;
    exports uz.jpms.payment to uz.jpms.core;
    exports uz.jpms.payment.domain to uz.jpms.core;
    exports uz.jpms.payment.service to uz.jpms.core;
}