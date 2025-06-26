package org.example;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import static org.junit.jupiter.api.Assertions.*;

public class ParameterizedUserTest {
    @ParameterizedTest
    @ValueSource(strings = {"Alice", "Bob", "Charlie"})
    void testNameIsNotEmpty(String name) {
        assertFalse(name.isEmpty());
    }
}