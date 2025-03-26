package com.marianbastiurea.c03arrays.sort;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class InsertionSortTest {
    @Test
    public void givenUnsortedArrayShouldReturnAscendingSortedArray() {
        int[] myArray = {2, 1, -100, 23, 4, 33, -9, 0, 100, 44, 4};
        int[] resultArray = {-100, -9, 0, 1, 2, 4, 4, 23, 33, 44, 100};
        int[] result = InsertionSort.sortUsingInsertion(myArray);
        assertArrayEquals(result, resultArray);
    }
}
