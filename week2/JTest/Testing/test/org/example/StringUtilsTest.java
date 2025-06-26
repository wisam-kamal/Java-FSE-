package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class StringUtilsTest {

    @Test
    void testUpperCase() {
        assertEquals("HELLO", "hello".toUpperCase());
    }
}
