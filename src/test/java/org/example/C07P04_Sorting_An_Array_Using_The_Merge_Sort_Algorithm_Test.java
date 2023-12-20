package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class C07P04_Sorting_An_Array_Using_The_Merge_Sort_Algorithm_Test {
    @Test
    public void TenElements() {
        int[] myArray = {17, 2, 34, -1, 222, 22, -10, 7, 100, 99, 90, 34, 90};
        int[] resultArray = {-10, -1, 2, 7, 17, 22, 34, 34, 90, 90, 99, 100, 222};
        int[] result = C07P04_Sorting_An_Array_Using_The_Merge_Sort_Algorithm.SortingUsingMergeSortingAlgorithm(myArray);
        assertArrayEquals(result, resultArray);
    }

}

