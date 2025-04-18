package com.marianbastiurea.c04matrices.transform;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

 class SpiralMatrixToArrayTest {
    @Test
    void givenAMatrixShouldReturnAnArrayWithElementsOfMatrixInSpiralTrack() {
        int[][] myMatrix = {{1, 2, 3, 4, 5}, {6, 7, 8, 9, 10}, {11, 12, 13, 14, 15}, {16, 17, 18, 19, 20}};
        int[] resultArray = {1, 2, 3, 4, 5, 10, 15, 20, 19, 18, 17, 16, 11, 6, 7, 8, 9, 14, 13, 12};
        int[] result = SpiralMatrixToArray.transformAMatrix(myMatrix);
        assertArrayEquals(resultArray, result);
    }
}
