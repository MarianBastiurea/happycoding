package com.marianbastiurea.c02controlflow.calculate;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class LeastCommonMultipleOfTwoGivenNumbersTest {
    @Test
    void zero() {
        int firstNumber = 0, secondNumber = -11;
        int lcm = 0;
        int result = LeastCommonMultipleOfTwoGivenNumbers.findLCM(firstNumber, secondNumber);
        assertEquals(result, lcm);
    }

    @Test
    void sixty() {
        int firstNumber = 15, secondNumber = 20;
        int lcm = 60;
        int result = LeastCommonMultipleOfTwoGivenNumbers.findLCM(firstNumber, secondNumber);
        assertEquals(result, lcm);
    }

}
