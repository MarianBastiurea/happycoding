package com.marianbastiurea.c05recursion;

import com.marianbastiurea.c05recursion.FibonacciSeriesUsingRecursion;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class FibonacciSeriesUsingRecursionTest {

    @Test
    public void given10AsNumberOfElementsShouldReturnAnArrayWithFirst10TermsOfFibonacciSeries() {
        int NumberOfElements = 10;
        int[] resultArray = {0, 1, 1, 2, 3, 5, 8, 13, 21, 34};
        int[] result = FibonacciSeriesUsingRecursion.firstNElements(NumberOfElements);
        assertArrayEquals(resultArray, result);
    }
}
