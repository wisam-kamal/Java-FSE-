package org.example.service;

import org.example.Calculator;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CalculatorServiceTest {

    @Test
    public void testAdd() {
        Calculator calculatorService = new Calculator();
        int result = calculatorService.add(3, 7);
        assertEquals(10, result);
    }
}
