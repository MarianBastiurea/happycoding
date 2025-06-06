package com.marianbastiurea.c02controlflow.calculate;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class CountPositiveAndNegativeNumbersTest {
    @Test
     void fourNumbersPositiveWithTwoNegativeNumbers() {
        int[] myArray = {-1, 2, -4, 90, 0, 9};
        int[] resultCount = {4, 2};
        int[] result = CountPositiveAndNegativeNumbers.count(myArray);
        assertArrayEquals(result, resultCount);
    }

    @Test
   void twoPositiveNumberWithFourNegativeNumbers() {
        int[] myArray = {-1, -2, -4, -90, 0, 9};
        int[] resultCount = {2, 4};
        int[] result = CountPositiveAndNegativeNumbers.count(myArray);
        assertArrayEquals(result, resultCount);
    }

    @Test
     void onlyOneZero() {
        int[] myArray = {0};
        int[] resultCount = {1, 0};
        int[] result = CountPositiveAndNegativeNumbers.count(myArray);
        assertArrayEquals(result, resultCount);
    }
}
