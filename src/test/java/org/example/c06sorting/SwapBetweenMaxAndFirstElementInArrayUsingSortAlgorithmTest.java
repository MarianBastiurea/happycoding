package org.example.c06sorting;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class SwapBetweenMaxAndFirstElementInArrayUsingSortAlgorithmTest {
    @Test
    public void fiveElement() {
        int[] myArray = {10, 25, 44, 33, 1};
        int[] resultArray = {44, 25, 10, 33, 1};
        int[] result = SwapBetweenMaxAndFirstElementInArrayUsingSortAlgorithm.swapBetweenMax(myArray);
        assertArrayEquals(result, resultArray);
    }

    @Test
    public void twoElement() {
        int[] myArray = {10, 5};
        int[] resultArray = {10, 5};
        int[] result = SwapBetweenMaxAndFirstElementInArrayUsingSortAlgorithm.swapBetweenMax(myArray);
        assertArrayEquals(result, resultArray);
    }

    @Test
    public void sameElement() {
        int[] myArray = {10, 10};
        int[] resultArray = {10, 10};
        int[] result = SwapBetweenMaxAndFirstElementInArrayUsingSortAlgorithm.swapBetweenMax(myArray);
        assertArrayEquals(result, resultArray);
    }
}
