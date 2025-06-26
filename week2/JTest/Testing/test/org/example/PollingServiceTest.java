package org.example;

import org.junit.jupiter.api.Test;
import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Assertions.*;

public class PollingServiceTest {

    @Test
    public void testMultipleReturns() {
        ExternalApi mockApi = mock(ExternalApi.class);

        when(mockApi.getData())
                .thenReturn("First")
                .thenReturn("Second")
                .thenReturn("Third");

        PollingService service = new PollingService(mockApi);
        String[] result = service.pollThreeTimes();

        assertArrayEquals(new String[]{"First", "Second", "Third"}, result);
    }
}
