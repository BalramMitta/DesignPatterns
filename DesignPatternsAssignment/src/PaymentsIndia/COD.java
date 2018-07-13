package PaymentsIndia;

public class COD extends Payment {

    public COD() {
        setPaymentType("Cash On Delivery");
    }

    @Override
    public void makePayment() {
       System.out.println("Payment by "+getPaymentType());
    }
}
