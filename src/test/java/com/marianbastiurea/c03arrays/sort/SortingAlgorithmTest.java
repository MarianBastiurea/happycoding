package com.marianbastiurea.c03arrays.sort;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class SortingAlgorithmTest {
    @Test
    void givenUnsortedArrayShouldReturnSameArrayAscendingSorted() {
        int[] myArray = {17, 2, 34, -1, 222, 22, -10, 7, 100, 99, 90, 34, 90};
        int[] resultArray = {-10, -1, 2, 7, 17, 22, 34, 34, 90, 90, 99, 100, 222};
        int[] result = MergeSort.sortingAlgorithm(myArray);
        assertArrayEquals(result, resultArray);
    }
}

