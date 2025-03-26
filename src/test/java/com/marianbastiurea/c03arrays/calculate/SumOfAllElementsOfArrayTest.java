package com.marianbastiurea.c03arrays.calculate;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SumOfAllElementsOfArrayTest {
    @Test
    public void sum0BecauseEmptyArray() {
        int[] myArray = {};
        int sum = 0;
        int result = SumOfAllElementsOfArray.findSum(myArray);
        assertEquals(result, sum);
    }

    @Test
    public void sum0BecauseSameNegativeAndPositiveElements() {
        int[] myArray = {-2, -1, 0, 1, 2};
        int sum = 0;
        int result = SumOfAllElementsOfArray.findSum(myArray);
        assertEquals(result, sum);
    }

    @Test
    public void sumEqualsWithNumberOfElements() {
        int[] myArray = {1, 1, 1, 1, 1};
        int sum = 5;
        int result = SumOfAllElementsOfArray.findSum(myArray);
        assertEquals(result, sum);
    }
}
