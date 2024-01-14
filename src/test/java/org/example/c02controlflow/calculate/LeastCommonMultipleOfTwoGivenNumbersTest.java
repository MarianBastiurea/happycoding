package org.example.c02controlflow.calculate;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

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
