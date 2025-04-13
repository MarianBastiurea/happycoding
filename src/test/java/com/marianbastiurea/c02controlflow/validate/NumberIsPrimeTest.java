package com.marianbastiurea.c02controlflow.validate;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

 class NumberIsPrimeTest {
    @Test
     void tenIsNotAPrimeNumber() {
        int number = 10;
        boolean result = NumberIsPrime.checkNumber(number);
        assertFalse(result);
    }

    @Test
     void threeIsPrimeNumber() {
        int number = 3;
        boolean result = NumberIsPrime.checkNumber(number);
        assertTrue(result);
    }

    @Test
     void oneHundredElevenIsNotPrimeNumber() {
        int number = 111;
        boolean result = NumberIsPrime.checkNumber(number);
        assertFalse(result);
    }
}
