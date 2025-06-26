package org.example;

import org.junit.jupiter.api.Test;
import org.mockito.InOrder;

import static org.mockito.Mockito.*;

public class AlertManagerTest {

    @Test
    public void testAlertOrder() {
        NotificationService mockService = mock(NotificationService.class);
        AlertManager manager = new AlertManager(mockService);

        manager.sendAlerts("ALERT");

        InOrder inOrder = inOrder(mockService);
        inOrder.verify(mockService).sendEmail("ALERT");
        inOrder.verify(mockService).sendSMS("ALERT");
        inOrder.verify(mockService).sendPushNotification("ALERT");
    }
}
