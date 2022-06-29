package uz.jpms.payment.domain;

public class Card {

    private String accountNumber;
    private String expiryDate;
    private String cvv;
    private Long balance;

    public Card(String accountNumber, String expiryDate, String cvv, Long balance) {
        this.accountNumber = accountNumber;
        this.expiryDate = expiryDate;
        this.cvv = cvv;
        this.balance = balance;
    }

    public void charge(Long amount) {
        if (balance.compareTo(amount) <= 0) {
            throw new IllegalArgumentException("No enough funds, card: " + this);
        }
        balance = balance - amount;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getExpiryDate() {
        return expiryDate;
    }

    public void setExpiryDate(String expiryDate) {
        this.expiryDate = expiryDate;
    }

    public String getCvv() {
        return cvv;
    }

    public void setCvv(String cvv) {
        this.cvv = cvv;
    }

    public Long getBalance() {
        return balance;
    }

    public void setBalance(Long balance) {
        this.balance = balance;
    }

}
