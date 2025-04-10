package com.marianbastiurea.c05recursion;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

 class FibonacciSeriesUsingRecursionTest {

    @Test
   void given10AsNumberOfElementsShouldReturnAnArrayWithFirst10TermsOfFibonacciSeries() {
        int numberOfElements = 10;
        int[] resultArray = {0, 1, 1, 2, 3, 5, 8, 13, 21, 34};
        int[] result = FibonacciSeriesUsingRecursion.firstNElements(numberOfElements);
        assertArrayEquals(resultArray, result);
    }
}
