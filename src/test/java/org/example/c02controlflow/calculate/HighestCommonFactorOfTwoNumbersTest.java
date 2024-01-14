package org.example.c02controlflow.calculate;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class HighestCommonFactorOfTwoNumbersTest {
    @Test
    public void negativeFour() {
        int firstInteger = -24;
        int secondInteger = -28;
        int HCF = -4;
        int result = HighestCommonFactorOfTwoNumbers.findHCF(firstInteger, secondInteger);
        assertEquals(result, HCF);
    }

    @Test
    public void one() {
        int firstInteger = 0;
        int secondInteger = 1;
        int HCF = 1;
        int result = HighestCommonFactorOfTwoNumbers.findHCF(firstInteger, secondInteger);
        assertEquals(result, HCF);
    }

    @Test
    public void five() {
        int firstInteger = 15;
        int secondInteger = 10;
        int HCF = 5;
        int result = HighestCommonFactorOfTwoNumbers.findHCF(firstInteger, secondInteger);
        assertEquals(result, HCF);
    }

    @Test
    public void negativeFive() {
        int firstInteger = -15;
        int secondInteger = 10;
        int HCF = -5;
        int result = HighestCommonFactorOfTwoNumbers.findHCF(firstInteger, secondInteger);
        assertEquals(result, HCF);
    }
}
