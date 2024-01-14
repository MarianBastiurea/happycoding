package org.example.c02controlflow.calculate;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

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
