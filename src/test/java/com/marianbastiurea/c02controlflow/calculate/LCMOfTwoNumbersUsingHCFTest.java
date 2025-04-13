package com.marianbastiurea.c02controlflow.calculate;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class LCMOfTwoNumbersUsingHCFTest {
    @Test
   void zero() {
        int firstNumber = 0, secondNumber = -11;
        int lcm = 0;
        int result = LCMOfTwoNumbersUsingHCF.findLCM(firstNumber, secondNumber);
        assertEquals(result, lcm);
    }

    @Test
     void sixty() {
        int firstNumber = 15, secondNumber = 20;
        int lcm = 60;
        int result = LCMOfTwoNumbersUsingHCF.findLCM(firstNumber, secondNumber);
        assertEquals(result, lcm);
    }

    @Test
    void ten() {
        int firstNumber = -10, secondNumber = 10;
        int lcm = 10;
        int result = LCMOfTwoNumbersUsingHCF.findLCM(firstNumber, secondNumber);
        assertEquals(result, lcm);
    }
}
