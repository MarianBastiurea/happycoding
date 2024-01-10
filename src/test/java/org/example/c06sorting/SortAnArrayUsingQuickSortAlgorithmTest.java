package org.example.c06sorting;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

public class SortAnArrayUsingQuickSortAlgorithmTest {
    @Test
    public void tenElements() {
        int[] myArray = {-2, 9, 0, -100, 90, 88, 0, 91, 100, 1};
        int[] resultArray = {-100, -2, 0, 0, 1, 9, 88, 90, 91, 100};
        int[] result = SortAnArrayUsingQuickSortAlgorithm.quickSort(myArray);
        assertArrayEquals(result, resultArray);
    }
    @Test
    public void sameElements() {
        int[] myArray = {1,1,1,1};
        int[] resultArray = {1,1,1,1};
        int[] result = SortAnArrayUsingQuickSortAlgorithm.quickSort(myArray);
        assertArrayEquals(result, resultArray);
    }
}
