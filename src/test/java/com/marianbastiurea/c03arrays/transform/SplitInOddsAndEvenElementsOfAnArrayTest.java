package com.marianbastiurea.c03arrays.transform;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class SplitInOddsAndEvenElementsOfAnArrayTest {
    @Test
    public void givenSameNumberOfOddsAndEvenElementsInAnArrayShouldReturnTwoArrayWithSameDimension() {
        int[] myArray = {1, 2, 3, 4, 5, 6};
        int[][] result = SplitInOddsAndEvenElementsOfAnArray.oddsAndEven(myArray);
        assertArrayEquals(result, new int[][]{{2, 4, 6}, {1, 3, 5}});
    }
}
