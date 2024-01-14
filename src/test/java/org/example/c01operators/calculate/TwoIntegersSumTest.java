package org.example.c01operators.calculate;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TwoIntegersSumTest {
    @Test
    public void zero() {
        int firstInteger = -2, secondInteger = 2;
        int sum = 0;
        int result = TwoIntegersSum.findSum(firstInteger, secondInteger);
        assertEquals(result, sum);
    }

    @Test
    public void four() {
        int firstInteger = 0, secondInteger = 4;
        int sum = 4;
        int result = TwoIntegersSum.findSum(firstInteger, secondInteger);
        assertEquals(result, sum);
    }

    @Test
    public void ten() {
        int firstInteger = 1, secondInteger = 9;
        int sum = 10;
        int result = TwoIntegersSum.findSum(firstInteger, secondInteger);
        assertEquals(result, sum);
    }
}
