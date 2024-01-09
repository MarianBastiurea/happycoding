package org.example.c03arrays;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;


public class TransposeAMatrixTest {
    @Test
    public void twoRowsAndTwoColumns() {
        int[][] myMatrix = {{1, 2}, {3, 4}};
        int[][] resultMatrix = {{1, 3}, {2, 4}};
        int[][] result = TransposeAMatrix.transposeAMatrix(myMatrix);
        assertArrayEquals(resultMatrix, result);
    }

    @Test
    public void fourRowsAndFourColumns() {
        int[][] myMatrix = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}, {13, 14, 15, 16}};
        int[][] resultMatrix = {{1, 5, 9, 13}, {2, 6, 10, 14}, {3, 7, 11, 15}, {4, 8, 12, 16}};
        int[][] result = TransposeAMatrix.transposeAMatrix(myMatrix);
        assertArrayEquals(resultMatrix, result);
    }

    @Test
    public void fourRowsAndTwoColumns() {
        int[][] myMatrix = {{1, 2}, {3, 4}, {5, 6}, {7, 8}};
        int[][] resultMatrix = {{1, 3, 5, 7}, {2, 4, 6, 8}};
        int[][] result = TransposeAMatrix.transposeAMatrix(myMatrix);
        assertArrayEquals(resultMatrix, result);
    }
}
