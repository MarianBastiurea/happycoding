package org.example.c05searchingandsorting;

import org.example.c05searchingandsorting.SortAnArrayUsingBubbleSortAlgorithm;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class SortAnArrayUsingBubbleSortAlgorithmTest {
    @Test
    public void FiveElements() {
        int[] myArray = {17, 2, 34, -1, 222};
        int[] resultArray = {222, 34, 17, 2, -1};
        int[] result = SortAnArrayUsingBubbleSortAlgorithm.SortArrayUsingBubbleSort(myArray);
        assertArrayEquals(result, resultArray);
    }

    @Test
    public void SixElements() {
        int[] myArray = {17, 2, 34, -1, 222, 2};
        int[] resultArray = {222, 34, 17, 2, 2, -1};
        int[] result = SortAnArrayUsingBubbleSortAlgorithm.SortArrayUsingBubbleSort(myArray);
        assertArrayEquals(result, resultArray);
    }

    @Test
    public void SameElements() {
        int[] myArray = {2, 2, 2, 2};
        int[] resultArray = {2, 2, 2, 2};
        int[] result = SortAnArrayUsingBubbleSortAlgorithm.SortArrayUsingBubbleSort(myArray);
        assertArrayEquals(result, resultArray);
    }
}
