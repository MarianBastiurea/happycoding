package org.example.c02controlflow.calculate;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LCMOfTwoNumbersUsingHCFTest {
    @Test
    public void zero() {
        int firstNumber = 0, secondNumber = -11;
        int LCM = 0;
        int result = LCMOfTwoNumbersUsingHCF.findLCM(firstNumber, secondNumber);
        assertEquals(result, LCM);
    }

    @Test
    public void sixty() {
        int firstNumber = 15, secondNumber = 20;
        int LCM = 60;
        int result = LCMOfTwoNumbersUsingHCF.findLCM(firstNumber, secondNumber);
        assertEquals(result, LCM);
    }

    @Test
    public void ten() {
        int firstNumber = -10, secondNumber = 10;
        int LCM = 10;
        int result = LCMOfTwoNumbersUsingHCF.findLCM(firstNumber, secondNumber);
        assertEquals(result, LCM);
    }
}
