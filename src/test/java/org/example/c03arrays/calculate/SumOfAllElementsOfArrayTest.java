package org.example.c03arrays.calculate;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class SumOfAllElementsOfArrayTest {
    @Test
    public void sumNullBecauseEmptyArray() {
        int[] myArray = {};
        int sum = 0;
        int result = SumOfAllElementsOfArray.findSum(myArray);
        assertEquals(result, sum);
    }

    @Test
    public void sumNullBecauseSameNegativeAndPositiveElements() {
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
