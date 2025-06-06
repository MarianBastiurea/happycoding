package com.marianbastiurea.c02controlflow.calculate;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

 class SumOfOddsValueTest {
    @Test
     void firstTen() {
        int[] myArray = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9,};
        int sum = 25;
        int result = SumOfOddsValue.findSum(myArray);
        assertEquals(result, sum);
    }

    @Test
     void secondTen() {
        int[] myArray = {10, 11, 12, 13, 14, 15, 16, 17, 18, 19,};
        int sum = 75;
        int result = SumOfOddsValue.findSum(myArray);
        assertEquals(result, sum);
    }
}
