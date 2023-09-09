package session13.homework.online_shop.payment;

import session13.homework.online_shop.client.Payer;
import session13.homework.online_shop.shop.Recipient;

public class Payment {

    private PaymentStatus paymentStatus;
    private Recipient recipient;
    private Payer payer;
    private double amount;

    public Payment(Recipient recipient, Payer payer, double amount) {
        this.recipient = recipient;
        this.payer = payer;
        this.amount = amount;
        this.paymentStatus = PaymentStatus.STAND_BY;
    }

    public double getAmount() {
        return amount;
    }

    public PaymentStatus getPaymentStatus() {
        return paymentStatus;
    }

    public void setPaymentStatus(PaymentStatus paymentStatus) {
        this.paymentStatus = paymentStatus;
    }

    public boolean processPayment() {
        if (payer.payMoney(amount)) {
            recipient.receiveMoney(amount);
            paymentStatus = PaymentStatus.PROCESSED;
            System.out.println("Payment of " + amount + " processed." );
            return true;
        } else {
            System.out.println("Payment of " + amount + " failed." );
            paymentStatus = PaymentStatus.FAILED;
            return false;
        }
    }
}
