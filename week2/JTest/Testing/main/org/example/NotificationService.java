package org.example;

public class NotificationService {
    private MessageSender sender;

    public NotificationService(MessageSender sender) {
        this.sender = sender;
    }

    public void notifyUser(String user, String content) {
        if (user != null && !user.isEmpty()) {
            sender.sendMessage(user, content);
        }
    }

    public void sendEmail(String alert) {
        }

    public void sendSMS(String alert) {
    }

    public void sendPushNotification(String alert) {

    }
}

