package org.example.c04recursion;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class CreateAnArrayWithFirstNNaturalNumbersUsingRecursionTest {
    @Test
    public void First5Elements() {
        int start = 0;
        int numberOfElements = 5;
        int[] resultArray = {1, 2, 3, 4, 5};
        int[] result = CreateAnArrayWithFirstNNaturalNumbersUsingRecursion.CreateAnArray(start, numberOfElements);
        assertArrayEquals(result, resultArray);
    }

    @Test
    public void First10Elements() {
        int start = 0;
        int numberOfElements = 10;
        int[] resultArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] result = CreateAnArrayWithFirstNNaturalNumbersUsingRecursion.CreateAnArray(start, numberOfElements);
        assertArrayEquals(result, resultArray);
    }
}
