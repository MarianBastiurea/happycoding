package org.example.c02controlflow.validate;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class NumberIsDividedBy3Test {
    @Test
    public void TwentyOneIsDividedBy3() {
        int number = 21;
        boolean result = NumberIsDividedBy3.findNumber(number);
        assertTrue(result);
    }

    @Test
    public void TenIsNotDividedBy3() {
        int number = 10;
        boolean result = NumberIsDividedBy3.findNumber(number);
        assertFalse(result);
    }
}
