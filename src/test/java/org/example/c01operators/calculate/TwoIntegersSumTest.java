package org.example.c01operators.calculate;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TwoIntegersSumTest {
    @Test
    public void samePositiveAndNegativeNumbers() {
        int firstInteger = -2, secondInteger = 2;
        int sum = 0;
        int result = TwoIntegersSum.findSum(firstInteger, secondInteger);
        assertEquals(result, sum);
    }

    @Test
    public void OneNumberIs0() {
        int firstInteger = 0, secondInteger = 4;
        int sum = 4;
        int result = TwoIntegersSum.findSum(firstInteger, secondInteger);
        assertEquals(result, sum);
    }

    @Test
    public void onePositiveAndOneNegativeNumber() {
        int firstInteger = 1, secondInteger = -9;
        int sum = -8;
        int result = TwoIntegersSum.findSum(firstInteger, secondInteger);
        assertEquals(result, sum);
    }
}
