package PaymentsIndia;

public interface Factory {
    public Payment getPayment(String paymentType);
}
