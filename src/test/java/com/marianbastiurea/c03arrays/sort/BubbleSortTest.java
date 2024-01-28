package com.marianbastiurea.c03arrays.sort;

import com.marianbastiurea.c03arrays.sort.BubbleSort;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class BubbleSortTest {
    @Test
    public void givenAnUnsortedArrayShouldReturnSameArrayInSortedDescending() {
        int[] myArray = {17, 2, 34, -1, 222};
        int[] resultArray = {222, 34, 17, 2, -1};
        int[] result = BubbleSort.sortArray(myArray);
        assertArrayEquals(result, resultArray);
    }
}
