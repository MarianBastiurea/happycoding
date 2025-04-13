package com.marianbastiurea.c03arrays.transform;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

 class ReverseArrayTest {

    @Test
   void givenAnArrayShouldReturnSameArrayInReverseOrder() {
        int[] myArray = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] resultArray = {9, 8, 7, 6, 5, 4, 3, 2, 1, 0};
        int[] result = ReverseArray.reverse(myArray);
        assertArrayEquals(resultArray, result);
    }
}
