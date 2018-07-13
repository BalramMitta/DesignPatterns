package PaymentsIndia;

public class Wallets extends Payment {


    public Wallets() {
        setPaymentType("Wallets");
    }

    @Override
    public void makePayment() {
        System.out.println("Payment by "+getPaymentType());

    }
}
