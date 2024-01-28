package com.marianbastiurea.c02controlflow.calculate;

import com.marianbastiurea.c02controlflow.calculate.HighestCommonFactorOfTwoNumbers;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class HighestCommonFactorOfTwoNumbersTest {
    @Test
    public void bothNegativeNumbers() {
        int firstInteger = -24;
        int secondInteger = -28;
        int HCF = -4;
        int result = HighestCommonFactorOfTwoNumbers.findHCF(firstInteger, secondInteger);
        assertEquals(result, HCF);
    }

    @Test
    public void oneNumberIs0() {
        int firstInteger = 0;
        int secondInteger = 1;
        int HCF = 1;
        int result = HighestCommonFactorOfTwoNumbers.findHCF(firstInteger, secondInteger);
        assertEquals(result, HCF);
    }

    @Test
    public void bothPositiveNumber() {
        int firstInteger = 15;
        int secondInteger = 10;
        int HCF = 5;
        int result = HighestCommonFactorOfTwoNumbers.findHCF(firstInteger, secondInteger);
        assertEquals(result, HCF);
    }

    @Test
    public void oneNegativeNumberAndOtherPositiveNumber() {
        int firstInteger = -15;
        int secondInteger = 10;
        int HCF = -5;
        int result = HighestCommonFactorOfTwoNumbers.findHCF(firstInteger, secondInteger);
        assertEquals(result, HCF);
    }
}
