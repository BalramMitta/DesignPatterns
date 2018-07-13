package PaymentsIndia;

public class CreditCard extends Payment {

    public CreditCard() {
        setPaymentType("Credit card");
    }

    @Override
    public void makePayment() {
        System.out.println("Payment by "+getPaymentType());

    }
}
