package com.marianbastiurea.c02controlflow.generate;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

 class NTermsOfFibonacciSeriesTest {
    @Test
     void first10Terms() {
        int number = 10;
        int[] myArray = {0, 1, 1, 2, 3, 5, 8, 13, 21, 34};
        int[] result = NTermsOfFibonacciSeries.storeElements(number);
        assertArrayEquals(result, myArray);
    }
}
