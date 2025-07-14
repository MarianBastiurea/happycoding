package com.marianbastiurea.c06challenges;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class MaxSumSparseSubsequenceTest {

    @Test
    void maxSumIs5MinBandWidthIs4() {
        int[] myArray = {3, -1, 4, 1, -2, 5, -3};
        int d = 1;
        int[] result = {4, 5};
        assertArrayEquals(result, MaxSumSparseSubsequence.createMatrixSum(myArray, d));
    }

    @Test
    void maxSumIs0MinBandWidthIs0() {
        int[] myArray = {2, 4, 6, 8, 10};
        int d = 2;
        int[] result = {0, 0};
        assertArrayEquals(result, MaxSumSparseSubsequence.createMatrixSum(myArray, d));
    }
}

