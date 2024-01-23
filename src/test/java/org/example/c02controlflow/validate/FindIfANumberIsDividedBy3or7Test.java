package org.example.c02controlflow.validate;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class FindIfANumberIsDividedBy3or7Test {
    @Test
    public void twentyOneIsDividedBy3and7() {
        int number = 21;
        boolean result = FindIfANumberIsDividedBy3or7.findNumber(number);
        assertTrue(result);
    }

    @Test
    public void tenIsNodDividedBy3or7() {
        int number = 10;
        boolean result = FindIfANumberIsDividedBy3or7.findNumber(number);
        assertFalse(result);
    }

    @Test

    public void threeIsDividedBy3() {
        int number = 3;
        boolean result = FindIfANumberIsDividedBy3or7.findNumber(number);
        assertTrue(result);
    }
}
