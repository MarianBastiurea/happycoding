package com.marianbastiurea.c03arrays.calculate;

import com.marianbastiurea.c03arrays.calculate.HowManyTimesAnElementsIsRepeatingInAnArray;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class HowManyTimesAnElementsIsRepeatingInAnArrayTest {
    @Test
    public void given7SameElementsRepeatingShouldBeDifferentFrom0() {
        int[] myArray = {2, 7, 0, 0, 4, 7, 8, 3, 4, 7, 2, 3, 7, 1, 4, 10, 10, 11, 11, 2};
        int[][] resultMatrix = {{2, 2}, {7, 3}, {0, 1}, {4, 2}, {3, 1}, {10, 1}, {11, 1}};
        int[][] result = HowManyTimesAnElementsIsRepeatingInAnArray.howManyTimes(myArray);
        assertArrayEquals(resultMatrix, result);
    }

    @Test
    public void givenDifferentElementsRepeatingShouldBe0() {
        int[] myArray = {2, 34, 77, 22, 21};
        int[][] resultMatrix = new int[0][0];
        int[][] result = HowManyTimesAnElementsIsRepeatingInAnArray.howManyTimes(myArray);
        assertArrayEquals(resultMatrix, result);
    }
}
