package org.example.c05searchingandsorting;

import org.example.c05searchingandsorting.SwapBetweenMaxAndFirstElementInArrayUsingSortAlgorithm;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class SwapBetweenMaxAndFirstElementInArrayUsingSortAlgorithmTest {
    @Test
    public void FiveElement() {
        int[] myArray = {10, 25, 44, 33, 1};
        int[] resultArray = {44, 25, 10, 33, 1};
        int[] result = SwapBetweenMaxAndFirstElementInArrayUsingSortAlgorithm.SwapBetweenMax(myArray);
        assertArrayEquals(result, resultArray);
    }

    @Test
    public void TwoElement() {
        int[] myArray = {10, 5};
        int[] resultArray = {10, 5};
        int[] result = SwapBetweenMaxAndFirstElementInArrayUsingSortAlgorithm.SwapBetweenMax(myArray);
        assertArrayEquals(result, resultArray);
    }

    @Test
    public void SameElement() {
        int[] myArray = {10, 10};
        int[] resultArray = {10, 10};
        int[] result = SwapBetweenMaxAndFirstElementInArrayUsingSortAlgorithm.SwapBetweenMax(myArray);
        assertArrayEquals(result, resultArray);
    }
}
