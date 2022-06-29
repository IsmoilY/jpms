package uz.jpms.payment.service;

import uz.jpms.logger.Logger;
import uz.jpms.logger.LoggerFactory;
import uz.jpms.payment.domain.Card;

public class PayPalPaymentService implements PaymentService {

    private static final Logger log = LoggerFactory.create(PayPalPaymentService.class);

    @Override
    public void charge(Card card, Long amount) {
        log.info("Connection to paypal with card: " + card);
        card.charge(amount);
        log.info("Charge with paypal from card: " + card);
    }
}
