package com.marianbastiurea.c02controlflow.calculate;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

 class HighestCommonFactorOfTwoNumbersTest {
    @Test
    void bothNegativeNumbers() {
        int firstInteger = -24;
        int secondInteger = -28;
        int hcf = -4;
        int result = HighestCommonFactorOfTwoNumbers.findHCF(firstInteger, secondInteger);
        assertEquals(result, hcf);
    }

    @Test
    void oneNumberIs0() {
        int firstInteger = 0;
        int secondInteger = 1;
        int hcf = 1;
        int result = HighestCommonFactorOfTwoNumbers.findHCF(firstInteger, secondInteger);
        assertEquals(result, hcf);
    }

    @Test
    void bothPositiveNumber() {
        int firstInteger = 15;
        int secondInteger = 10;
        int HChcf = 5;
        int result = HighestCommonFactorOfTwoNumbers.findHCF(firstInteger, secondInteger);
        assertEquals(result, HChcf);
    }

    @Test
    void oneNegativeNumberAndOtherPositiveNumber() {
        int firstInteger = -15;
        int secondInteger = 10;
        int hcf = -5;
        int result = HighestCommonFactorOfTwoNumbers.findHCF(firstInteger, secondInteger);
        assertEquals(result, hcf);
    }
}
