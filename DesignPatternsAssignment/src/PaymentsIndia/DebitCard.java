package PaymentsIndia;

public class DebitCard extends Payment {

    public DebitCard() {
        setPaymentType("Debit card");
    }

    @Override
    public void makePayment() {
        System.out.println("Payment by "+getPaymentType());

    }
}
