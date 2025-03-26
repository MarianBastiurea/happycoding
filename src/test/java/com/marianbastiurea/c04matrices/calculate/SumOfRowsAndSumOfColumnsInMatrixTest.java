package com.marianbastiurea.c04matrices.calculate;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class SumOfRowsAndSumOfColumnsInMatrixTest {
    @Test
    public void givenAMatrixShouldReturnSumOfElementsInAColumnAndSumOfElementsInARow() {
        int[][] myMatrix = {{1, 2}, {3, 4}};
        int[][] sum = {{3, 7}, {4, 6}};
        int[][] result = SumOfRowsAndSumOfColumnsInMatrix.sumInMatrix(myMatrix);
        assertArrayEquals(sum, result);
    }
}
