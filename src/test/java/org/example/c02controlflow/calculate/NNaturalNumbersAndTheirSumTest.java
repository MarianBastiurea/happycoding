package org.example.c02controlflow.calculate;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class NNaturalNumbersAndTheirSumTest {
    @Test
    public void zero() {
        int[] myArray = {-4, -3, -2, -1, 0, 1, 2, 3, 4};
        int sum = 0;
        int result = NNaturalNumbersAndTheirSum.findSum(myArray);
        assertEquals(result, sum);
    }

    @Test
    public void fortyFive() {
        int[] myArray = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        int sum = 45;
        int result = NNaturalNumbersAndTheirSum.findSum(myArray);
        assertEquals(result, sum);
    }

    @Test
    public void againZero() {
        int[] myArray = {0};
        int sum = 0;
        int result = NNaturalNumbersAndTheirSum.findSum(myArray);
        assertEquals(result, sum);
    }
}
