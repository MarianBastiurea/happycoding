package org.example.c05recursion;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class FibonacciSeriesUsingRecursionTest {
    @Test
    public void first5Element() {
        int NumberOfElements = 5;
        int[] resultArray = {0, 1, 1, 2, 3};
        int[] result = FibonacciSeriesUsingRecursion.firstNElements(NumberOfElements);
        assertArrayEquals(resultArray, result);
    }

    @Test
    public void first10Element() {
        int NumberOfElements = 10;
        int[] resultArray = {0, 1, 1, 2, 3, 5, 8, 13, 21, 34};
        int[] result = FibonacciSeriesUsingRecursion.firstNElements(NumberOfElements);
        assertArrayEquals(resultArray, result);
    }
}
