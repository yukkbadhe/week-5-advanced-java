interface Payment {
    void pay();
    void showPaymentDetails();
}

class UPIPayment implements Payment {

    public void pay() {
        System.out.println("Payment done using UPI");
    }

    public void showPaymentDetails() {
        System.out.println("UPI Payment: Google Pay");
    }
}

class CardPayment implements Payment {

    public void pay() {
        System.out.println("Payment done using Card");
    }

    public void showPaymentDetails() {
        System.out.println("Card Payment: Debit Card");
    }
}

public class PaymentDemo {
    public static void main(String[] args) {

        UPIPayment upi = new UPIPayment();
        upi.pay();
        upi.showPaymentDetails();

        System.out.println();

        CardPayment card = new CardPayment();
        card.pay();
        card.showPaymentDetails();
    }
}