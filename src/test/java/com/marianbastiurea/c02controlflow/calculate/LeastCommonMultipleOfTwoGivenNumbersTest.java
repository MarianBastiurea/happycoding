package com.marianbastiurea.c02controlflow.calculate;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LeastCommonMultipleOfTwoGivenNumbersTest {
    @Test
    public void zero() {
        int firstNumber = 0, secondNumber = -11;
        int LCM = 0;
        int result = LeastCommonMultipleOfTwoGivenNumbers.findLCM(firstNumber, secondNumber);
        assertEquals(result, LCM);
    }

    @Test
    public void sixty() {
        int firstNumber = 15, secondNumber = 20;
        int LCM = 60;
        int result = LeastCommonMultipleOfTwoGivenNumbers.findLCM(firstNumber, secondNumber);
        assertEquals(result, LCM);
    }

}
