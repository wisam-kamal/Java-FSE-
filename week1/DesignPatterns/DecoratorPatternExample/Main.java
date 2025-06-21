public class Main {
    public static void main(String[] args) {

        Notifier email = new EmailNotifier();
        email.send();

        System.out.println("\nEmail + SMS");

        Notifier emailWithSMS = new SMSNotifierDecorator(new EmailNotifier());
        emailWithSMS.send();

        System.out.println("\n--- Email + SMS + Slack ---");
        Notifier fullNotify = new SlackNotifierDecorator(
                new SMSNotifierDecorator(
                        new EmailNotifier()));
        fullNotify.send();
    }
}