package PaymentsIndia;

public class NetBanking extends Payment {

    public NetBanking() {
        setPaymentType("Net Banking");
    }

    @Override



    public void makePayment() {
        System.out.println("Payment by "+getPaymentType());

    }
}
