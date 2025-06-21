public interface PaymentProcessor {
    void processPayment(double amount);
}


class PayPalGateway {
    public void makePayment(double amountInUSD) {
        System.out.println("Paid $" + amountInUSD + " via PayPal.");
    }
}
class StripeGateway {
    public void sendPayment(double amountInRupees) {
        System.out.println("Paid ₹" + amountInRupees + " via Stripe.");
    }
}

class PayPalAdapter implements PaymentProcessor {
    private PayPalGateway paypal = new PayPalGateway();

    @Override
    public void processPayment(double amount) {
        paypal.makePayment(amount);
    }
}

class StripeAdapter implements PaymentProcessor {
    private StripeGateway stripe = new StripeGateway();

    @Override
    public void processPayment(double amount) {
        stripe.sendPayment(amount);
    }
}
