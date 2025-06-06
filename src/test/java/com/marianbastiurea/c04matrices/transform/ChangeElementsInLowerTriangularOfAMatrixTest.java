package com.marianbastiurea.c04matrices.transform;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

 class ChangeElementsInLowerTriangularOfAMatrixTest {
    @Test
     void givenMatrixShouldReplaceElementsFromLowerTriangularWith0() {
        //Changing elements with 0
        int[][] myMatrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int[][] resultMatrix = {{1, 2, 3}, {0, 5, 6}, {0, 0, 9}};
        int[][] result = ChangeElementsInLowerTriangularOfAMatrix.changeElements(myMatrix);
        assertArrayEquals(resultMatrix, result);
    }
}
