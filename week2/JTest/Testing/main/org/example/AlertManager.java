package org.example;

public class AlertManager {
    private NotificationService notificationService;

    public AlertManager(NotificationService notificationService) {
        this.notificationService = notificationService;
    }

    public void sendAlerts(String message) {
        notificationService.sendEmail(message);
        notificationService.sendSMS(message);
        notificationService.sendPushNotification(message);
    }
}
