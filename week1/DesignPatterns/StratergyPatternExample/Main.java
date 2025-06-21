public class Main {
    public static void main(String[] args) {
        PaymentContext context = new PaymentContext();

        context.setPaymentStrategy(new CreditCardPayment("John Doe", "1234-5678-9876", "123", "12/26"));
        context.pay(250.00);

        System.out.println();

        context.setPaymentStrategy(new PayPalPayment("john@example.com", "password123"));
        context.pay(150.00);
    }
}
