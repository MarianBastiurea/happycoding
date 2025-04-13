package com.marianbastiurea.c03arrays.sort;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

 class QuickSortTest {
    @Test
     void givenUnsortedArrayShouldReturnSameArrayAscendingSorted() {
        int[] myArray = {-2, 9, 0, -100, 90, 88, 0, 91, 100, 1};
        int[] resultArray = {-100, -2, 0, 0, 1, 9, 88, 90, 91, 100};
        int[] result = QuickSort.quickSort(myArray);
        assertArrayEquals(resultArray, result);
    }
}
