package PaymentsIndia;

public class PaymentFactory implements Factory{

    @Override
    public Payment getPayment(String paymentType){
        Payment payment;

        if(paymentType.equals("COD")){
            payment = new COD();
        }
        else if(paymentType.equals("Creditcard")){
            payment = new CreditCard();
        }
        else if(paymentType.equals("Debitcard")){
            payment = new DebitCard();
        }
        else if(paymentType.equals("Wallets")){
            payment = new Wallets();
        }
        else if(paymentType.equals("NetBanking")){
            payment = new NetBanking();
        }
        else
            payment = null;
        return payment;

    }

}
