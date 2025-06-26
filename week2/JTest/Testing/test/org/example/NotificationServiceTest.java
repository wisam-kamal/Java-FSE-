package org.example;

import org.junit.jupiter.api.Test;
import static org.mockito.Mockito.*;
import static org.mockito.ArgumentMatchers.*;

public class NotificationServiceTest {

    @Test
    public void testArgumentMatching() {
        MessageSender mockSender = mock(MessageSender.class);
        NotificationService service;
        service = new NotificationService(mockSender);

        service.notifyUser("jyothi@example.com", "Hello");

        verify(mockSender).sendMessage(anyString(), eq("Hello"));
    }
}
