package com.marianbastiurea.c02controlflow.calculate;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SumOfDisplay10IntegersTest {
    @Test
    void firstTest() {
        int[] myArray = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        int sum = 45;
        int result = SumOfFirst10Integers.findSum(myArray);
        assertEquals(sum,result);
    }

    @Test
    void secondTest() {
        int[] myArray = {-9, -8, -7, -6, -5, -4, -3, -2, -1, 0};
        int sum = -45;
        int result = SumOfFirst10Integers.findSum(myArray);
        assertEquals(sum,result);
    }
}
