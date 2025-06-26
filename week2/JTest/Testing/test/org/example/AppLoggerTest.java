package org.example;

import org.junit.jupiter.api.Test;
import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Assertions.*;

public class AppLoggerTest {

    @Test
    public void testLogException() throws Exception {
        LoggerService mockLogger = mock(LoggerService.class);
        doThrow(new Exception("Disk full")).when(mockLogger).log("ERROR");

        AppLogger appLogger = new AppLogger(mockLogger);
        appLogger.performLog("ERROR");

        verify(mockLogger).log("ERROR");
    }
}
