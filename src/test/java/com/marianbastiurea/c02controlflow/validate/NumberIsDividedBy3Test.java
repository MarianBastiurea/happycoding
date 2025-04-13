package com.marianbastiurea.c02controlflow.validate;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

 class NumberIsDividedBy3Test {
    @Test
     void twentyOneIsDividedBy3() {
        int number = 21;
        boolean result = NumberIsDividedBy3.findNumber(number);
        assertTrue(result);
    }

    @Test


     void tenIsNotDividedBy3() {
        int number = 10;
        boolean result = NumberIsDividedBy3.findNumber(number);
        assertFalse(result);
    }

    @Test
     void threeIsDividedBy3() {
        int number = 3;
        boolean result = NumberIsDividedBy3.findNumber(number);
        assertTrue(result);
    }
}
