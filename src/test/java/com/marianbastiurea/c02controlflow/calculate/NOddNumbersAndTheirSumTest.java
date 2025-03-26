package com.marianbastiurea.c02controlflow.calculate;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class NOddNumbersAndTheirSumTest {
    @Test
    public void twentyFive() {
        int[] myArray = {1, 3, 5, 7, 9};
        int sum = 25;
        int result = NOddNumbersAndTheirSum.findSum(myArray);
        assertEquals(result, sum);
    }

    @Test
    public void zero() {
        int[] myArray = {-1, 3, 7, -9};
        int sum = 0;
        int result = NOddNumbersAndTheirSum.findSum(myArray);
        assertEquals(result, sum);
    }
}
