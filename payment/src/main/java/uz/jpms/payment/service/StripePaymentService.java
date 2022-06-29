package uz.jpms.payment.service;

import uz.jpms.logger.Logger;
import uz.jpms.logger.LoggerFactory;
import uz.jpms.payment.domain.Card;

public class StripePaymentService implements PaymentService {

    private static final Logger log = LoggerFactory.create(StripePaymentService.class);

    @Override
    public void charge(Card card, Long amount) {
        log.info("Connection to strip with card: " + card);
        card.charge(amount);
        log.info("Charge with stripe from card: " + card);
    }
}
