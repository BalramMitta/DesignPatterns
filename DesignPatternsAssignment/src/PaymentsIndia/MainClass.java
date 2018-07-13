package PaymentsIndia;

import java.util.Scanner;

public class MainClass {

    public static void main(String[] a){

        Payment payment= null;
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println("Choose Payment : \n COD \n Creditcard \n Debitcard \n Wallets \n NetBanking \n");
            String paymentType = scanner.nextLine();
            payment=new PaymentFactory().getPayment(paymentType);
            if(payment!=null)
                payment.makePayment();
        }while ( payment ==null  );

        scanner.close();

    }

}
