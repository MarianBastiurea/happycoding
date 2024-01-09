package org.example.c03arrays;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class MergeAndSortDescendingTwoArrayTest {
    @Test
    public void mergeAndSortTwoArray() {
        MergeAndSortDescendingTwoArray obj = new MergeAndSortDescendingTwoArray();
        int[] FirstArray = {1, 2, 3};
        int[] SecondArray = {-1, 0, 4};
        int[] resultArray = {4, 3, 2, 1, 0, -1};
        int[] result = obj.mergeAndSort(FirstArray, SecondArray);
        assertArrayEquals(result, resultArray);
    }
}
