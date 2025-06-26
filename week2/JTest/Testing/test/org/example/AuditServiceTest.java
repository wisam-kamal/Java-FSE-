package org.example;

import org.junit.jupiter.api.Test;
import static org.mockito.Mockito.*;

public class AuditServiceTest {

    @Test
    public void testVoidMethodLogging() {
        Logger mockLogger = mock(Logger.class);
        AuditService auditService = new AuditService(mockLogger);

        auditService.performAudit("Delete Record");

        verify(mockLogger).log("Audit action: Delete Record");
    }
}
