package org.example.c06sorting;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class SortingAlgorithmTest {
    @Test
    public void tenElements() {
        int[] myArray = {17, 2, 34, -1, 222, 22, -10, 7, 100, 99, 90, 34, 90};
        int[] resultArray = {-10, -1, 2, 7, 17, 22, 34, 34, 90, 90, 99, 100, 222};
        int[] result = SortingUsingMergeSortAlgorithm.sortingAlgorithm(myArray);
        assertArrayEquals(result, resultArray);
    }
    @Test
    public void sameElements() {
        int[] myArray = {1,1,1,1,1,1,1};
        int[] resultArray = {1,1,1,1,1,1,1};
        int[] result = SortingUsingMergeSortAlgorithm.sortingAlgorithm(myArray);
        assertArrayEquals(result, resultArray);
    }
}

