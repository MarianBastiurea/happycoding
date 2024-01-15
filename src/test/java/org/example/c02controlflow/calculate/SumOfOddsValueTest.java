package org.example.c02controlflow.calculate;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class SumOfOddsValueTest {
    @Test
    public void firstTen() {
        int[] myArray = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9,};
        int sum = 25;
        int result = SumOfOddsValue.findSum(myArray);
        assertEquals(result, sum);
    }

    @Test
    public void secondTen() {
        int[] myArray = {10, 11, 12, 13, 14, 15, 16, 17, 18, 19,};
        int sum = 75;
        int result = SumOfOddsValue.findSum(myArray);
        assertEquals(result, sum);
    }
}
