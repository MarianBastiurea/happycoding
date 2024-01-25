package org.example.c03arrays.calculate;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class FindPairOfElementsOfAnArrayWithGivenSumTest {
    @Test
    public void given15asSumShouldBe3Pairs() {
        int[] myArray = {6, 8, 4, -5, 7, 9, 11};
        int sum = 15;
        int[][] pair = {{6, 9}, {8, 7}, {4, 11}};
        int[][] result = FindPairOfElementsOfAnArrayWithGivenSum.findPair(myArray, sum);
        assertArrayEquals(pair, result);
    }

    @Test
    public void given7AsSumShouldBeNoPairs() {
        int[] myArray = {15, 5, 20, 0, 25, -5};
        int sum = 7;
        int[][] pair = new int[0][0];
        int[][] result = FindPairOfElementsOfAnArrayWithGivenSum.findPair(myArray, sum);
        assertArrayEquals(pair, result);
    }
}


