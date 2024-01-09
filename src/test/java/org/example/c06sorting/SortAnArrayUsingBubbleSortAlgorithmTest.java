package org.example.c06sorting;

import org.example.c06sorting.SortAnArrayUsingBubbleSortAlgorithm;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class SortAnArrayUsingBubbleSortAlgorithmTest {
    @Test
    public void fiveElements() {
        int[] myArray = {17, 2, 34, -1, 222};
        int[] resultArray = {222, 34, 17, 2, -1};
        int[] result = SortAnArrayUsingBubbleSortAlgorithm.sortArray(myArray);
        assertArrayEquals(result, resultArray);
    }

    @Test
    public void sixElements() {
        int[] myArray = {17, 2, 34, -1, 222, 2};
        int[] resultArray = {222, 34, 17, 2, 2, -1};
        int[] result = SortAnArrayUsingBubbleSortAlgorithm.sortArray(myArray);
        assertArrayEquals(result, resultArray);
    }

    @Test
    public void sameElements() {
        int[] myArray = {2, 2, 2, 2};
        int[] resultArray = {2, 2, 2, 2};
        int[] result = SortAnArrayUsingBubbleSortAlgorithm.sortArray(myArray);
        assertArrayEquals(result, resultArray);
    }
}
