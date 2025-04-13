package com.marianbastiurea.c03arrays.transform;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

 class SwapBetweenMaxAndFirstElementInArrayUsingSortAlgorithmTest {
    @Test
     void givenUnsortedArrayShouldFindMaxNumberAndPutInPosition0() {
        int[] myArray = {10, 25, 44, 33, 1};
        int[] resultArray = {44, 25, 10, 33, 1};
        int[] result = SwapBetweenMaxAndFirstElementInArrayUsingSortAlgorithm.swapBetweenMax(myArray);
        assertArrayEquals(resultArray, result);
    }
}
