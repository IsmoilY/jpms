package uz.jpms.payment;

import uz.jpms.payment.service.PayPalPaymentService;
import uz.jpms.payment.service.PaymentService;
import uz.jpms.payment.service.StripePaymentService;
import uz.jpms.payment.service.VisaPaymentService;

public class PaymentFactory {

    public static enum Provider {
        PAY_PAL, VISA, STRIPE
    }

    public static PaymentService create(Provider provider) {
        PaymentService service;
        switch (provider) {
            case VISA:
                service = new VisaPaymentService();
                break;
            case PAY_PAL:
                service = new PayPalPaymentService();
                break;
            case STRIPE:
                service = new StripePaymentService();
                break;
            default:
                throw new RuntimeException("Unsupported payment provider");
        }
        return service;
    }

}
