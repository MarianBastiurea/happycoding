package org.example.c03Arrays;

import org.example.c03arrays.SumOfRowsAndSumOfColumnsInMatrix;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class SumOfRowsAndSumOfColumnsInMatrixTest {
    @Test
    public void TwoElementsMatrix() {
        int[][] myMatrix = {{1, 2}, {3, 4}};
        int[][] sum = {{3, 7}, {4, 6}};
        int[][] result = SumOfRowsAndSumOfColumnsInMatrix.SumInMatrix(myMatrix);
        assertArrayEquals(sum, result);
    }

    @Test
    public void FourElementsMatrix() {
        int[][] myMatrix = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}, {13, 14, 15, 16}};
        int[][] sum = {{10, 26, 42, 58}, {28, 32, 36, 40}};
        int[][] result = SumOfRowsAndSumOfColumnsInMatrix.SumInMatrix(myMatrix);
        assertArrayEquals(sum, result);
    }
}
