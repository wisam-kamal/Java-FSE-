public class Main {
    public static void main(String[] args) {
        PaymentProcessor paypalProcessor = new PayPalAdapter();
        PaymentProcessor stripeProcessor = new StripeAdapter();

        paypalProcessor.processPayment(100.0);
        stripeProcessor.processPayment(8500.0);
    }
}
