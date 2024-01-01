package org.example.c03Arrays;

import org.example.c03arrays.MergeAndSortDescendingTwoArray;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class MergeAndSortDescendingTwoArrayTest {
    @Test
    public void MergeAndSortTwoArray() {
        MergeAndSortDescendingTwoArray obj = new MergeAndSortDescendingTwoArray();
        int[] FirstArray = {1, 2, 3};
        int[] SecondArray = {-1, 0, 4};
        int[] resultArray = {4, 3, 2, 1, 0, -1};
        int[] result = obj.MergeAndSort(FirstArray, SecondArray);
        assertArrayEquals(result, resultArray);
    }
}
