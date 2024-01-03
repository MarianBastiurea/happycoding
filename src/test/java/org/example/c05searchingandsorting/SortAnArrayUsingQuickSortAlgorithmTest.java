package org.example.c05searchingandsorting;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.example.c05searchingandsorting.SortAnArrayUsingQuickSortAlgorithm;
import org.junit.jupiter.api.Test;

public class SortAnArrayUsingQuickSortAlgorithmTest {
    @Test
    public void TenElements() {
        int[] myArray = {-2, 9, 0, -100, 90, 88, 0, 91, 100, 1};
        int[] resultArray = {-100, -2, 0, 0, 1, 9, 88, 90, 91, 100};
        int[] result = SortAnArrayUsingQuickSortAlgorithm.QuickSort(myArray);
        assertArrayEquals(result, resultArray);
    }
    @Test
    public void SameElements() {
        int[] myArray = {1,1,1,1};
        int[] resultArray = {1,1,1,1};
        int[] result = SortAnArrayUsingQuickSortAlgorithm.QuickSort(myArray);
        assertArrayEquals(result, resultArray);
    }
}
