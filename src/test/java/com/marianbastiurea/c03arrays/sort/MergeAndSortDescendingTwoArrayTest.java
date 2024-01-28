package com.marianbastiurea.c03arrays.sort;

import com.marianbastiurea.c03arrays.transform.MergeAndSortDescendingTwoArray;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class MergeAndSortDescendingTwoArrayTest {
    @Test
    public void given2ArraysAscendingSortedShouldReturnAnArrayDescendingSorted() {
        int[] firstArray = {1, 2, 3, 9, 45, 100, 900};
        int[] secondArray = {-24, -15, -1, 0, 4};
        int[] resultArray = {900, 100, 45, 9, 4, 3, 2, 1, 0, -1, -15, -24};
        int[] result = MergeAndSortDescendingTwoArray.mergeAndSort(firstArray, secondArray);
        assertArrayEquals(result, resultArray);
    }
}
