package uz.jpms.payment.service;

import uz.jpms.payment.domain.Card;

public interface PaymentService {

    void charge(Card card, Long amount);

}
