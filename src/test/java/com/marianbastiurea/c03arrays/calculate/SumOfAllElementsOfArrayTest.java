package com.marianbastiurea.c03arrays.calculate;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

 class SumOfAllElementsOfArrayTest {
    @Test
     void sum0BecauseEmptyArray() {
        int[] myArray = {};
        int sum = 0;
        int result = SumOfAllElementsOfArray.findSum(myArray);
        assertEquals(result, sum);
    }

    @Test
     void sum0BecauseSameNegativeAndPositiveElements() {
        int[] myArray = {-2, -1, 0, 1, 2};
        int sum = 0;
        int result = SumOfAllElementsOfArray.findSum(myArray);
        assertEquals(result, sum);
    }

    @Test
     void sumEqualsWithNumberOfElements() {
        int[] myArray = {1, 1, 1, 1, 1};
        int sum = 5;
        int result = SumOfAllElementsOfArray.findSum(myArray);
        assertEquals(result, sum);
    }
}
