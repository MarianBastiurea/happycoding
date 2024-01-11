package org.example.c03arrays.transform;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class MergeAndSortDescendingTwoArrayTest {
    @Test
    public void mergeAndSortTwoArray() {
        MergeAndSortDescendingTwoArray obj = new MergeAndSortDescendingTwoArray();
        int[] firstArray = {1, 2, 3};
        int[] secondArray = {-1, 0, 4};
        int[] resultArray = {4, 3, 2, 1, 0, -1};
        int[] result = obj.mergeAndSort(firstArray, secondArray);
        assertArrayEquals(result, resultArray);
    }
}
