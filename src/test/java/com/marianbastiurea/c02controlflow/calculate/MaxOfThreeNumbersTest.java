package com.marianbastiurea.c02controlflow.calculate;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MaxOfThreeNumbersTest {
    @Test
    public void zero() {
        int firstNumber = -1, secondNumber = 0, thirdNumber = -100;
        int max = 0;
        int result = MaxOfThreeNumbers.findMax(firstNumber, secondNumber, thirdNumber);
        assertEquals(result, max);

    }

    @Test
    public void one() {
        int firstNumber = -1, secondNumber = 0, thirdNumber = 1;
        int max = 1;
        int result = MaxOfThreeNumbers.findMax(firstNumber, secondNumber, thirdNumber);
        assertEquals(result, max);

    }

    @Test
    public void firstNumberIsMaxNumber() {
        int firstNumber = 100, secondNumber = 0, thirdNumber = 1;
        int max = 100;
        int result = MaxOfThreeNumbers.findMax(firstNumber, secondNumber, thirdNumber);
        assertEquals(result, max);

    }
}
