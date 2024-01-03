package org.example.c04recursion;

import org.example.c04recursion.FindFirstNElementsOfFibonacciSeriesUsingRecursion;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class FindFirstNElementsOfFibonacciSeriesUsingRecursionTest {
    @Test
    public void First5Element() {
        int NumberOfElements = 5;
        int[] resultArray = {0, 1, 1, 2, 3};
        int[] result = FindFirstNElementsOfFibonacciSeriesUsingRecursion.FirstNElements(NumberOfElements);
        assertArrayEquals(resultArray, result);
    }

    @Test
    public void First10Element() {
        int NumberOfElements = 10;
        int[] resultArray = {0, 1, 1, 2, 3, 5, 8, 13, 21, 34};
        int[] result = FindFirstNElementsOfFibonacciSeriesUsingRecursion.FirstNElements(NumberOfElements);
        assertArrayEquals(resultArray, result);
    }
}
