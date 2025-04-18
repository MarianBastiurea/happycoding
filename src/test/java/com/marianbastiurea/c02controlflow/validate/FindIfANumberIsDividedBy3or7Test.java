package com.marianbastiurea.c02controlflow.validate;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

 class FindIfANumberIsDividedBy3or7Test {
    @Test
    void twentyOneIsDividedBy3and7() {
        int number = 21;
        boolean result = FindIfANumberIsDividedBy3or7.findNumber(number);
        assertTrue(result);
    }

    @Test
   void tenIsNodDividedBy3or7() {
        int number = 10;
        boolean result = FindIfANumberIsDividedBy3or7.findNumber(number);
        assertFalse(result);
    }

    @Test

    void threeIsDividedBy3() {
        int number = 3;
        boolean result = FindIfANumberIsDividedBy3or7.findNumber(number);
        assertTrue(result);
    }
}
