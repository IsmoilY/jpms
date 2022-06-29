package uz.jpms.payment.service;

import uz.jpms.logger.Logger;
import uz.jpms.logger.LoggerFactory;
import uz.jpms.payment.domain.Card;

public class VisaPaymentService implements PaymentService {

    private static final Logger log = LoggerFactory.create(VisaPaymentService.class);

    @Override
    public void charge(Card card, Long amount) {
        log.info("Connection to VISA with card: " + card);
        card.charge(amount);
        log.info("Charge with VISA from card: " + card);
    }
}
