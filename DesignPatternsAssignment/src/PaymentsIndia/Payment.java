package PaymentsIndia;

public abstract class Payment {

    String paymentType;

    public String getPaymentType() {
        return paymentType;
    }

    public void setPaymentType(String paymentType) {
        this.paymentType = paymentType;
    }


    public abstract void makePayment();


}
