package org.example.c05searchingandsorting;

import org.example.c05searchingandsorting.SortAnArrayUsingTheInsertionSortAlgorithm;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class SortAnArrayUsingTheInsertionSortAlgorithmTest {
    @Test
    public void TenElements() {
        int[] myArray = {2, 1, -100, 23, 4, 33, -9, 0, 100, 44, 4};
        int[] resultArray = {-100, -9, 0, 1, 2, 4, 4, 23, 33, 44, 100};
        int[] result = SortAnArrayUsingTheInsertionSortAlgorithm.SortUsingInsertion(myArray);
        assertArrayEquals(result, resultArray);
    }

    @Test
    public void SameElements() {
        int[] myArray = {2, 2, 2, 2, 2,};
        int[] resultArray = {2, 2, 2, 2, 2};
        int[] result = SortAnArrayUsingTheInsertionSortAlgorithm.SortUsingInsertion(myArray);
        assertArrayEquals(result, resultArray);
    }
}
