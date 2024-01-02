package org.example.c03Arrays;

import org.example.c03arrays.SumOfLeftDiagonalInMatrix;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SumOfLeftDiagonalInMatrixTest {
    @Test
    public void twoRowsAndTwoColumns() {
        int[][] myMatrix = {{1, 2}, {3, 4}};
        int sum = 5;
        int result = SumOfLeftDiagonalInMatrix.sumOfDiagonal(myMatrix);
        assertEquals(result, sum);
    }

    @Test
    public void A4x4Matrix() {
        int[][] myMatrix = {{1, 2, 3, 4}, {0, 1, 3, 0}, {0, 0, 10, 0}, {0, 0, 0, 10}};
        int sum = 7;
        int result = SumOfLeftDiagonalInMatrix.sumOfDiagonal(myMatrix);
        assertEquals(result, sum);
    }

    @Test
    public void EmptyMatrix() {
        int[][] myMatrix = {{}};
        int sum = 0;
        int result = SumOfLeftDiagonalInMatrix.sumOfDiagonal(myMatrix);
        assertEquals(result, sum);
    }
}
