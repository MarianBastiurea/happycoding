package org.example.c04matrices.calculate;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SumOfRightDiagonalInMatrixTest {
    @Test
    public void twoRowsAndTwoColumns() {
        int[][] myMatrix = {{1, 2}, {3, 4}};
        int sum = 5;
        int result = SumOfRightDiagonalInMatrix.sumOfDiagonal(myMatrix);
        assertEquals(result, sum);
    }

    @Test
    public void a4X4Matrix() {
        int[][] myMatrix = {{1, 2, 3, 4}, {0, 1, 3, 0}, {0, 0, 10, 0}, {0, 0, 0, 10}};
        int sum = 22;
        int result = SumOfRightDiagonalInMatrix.sumOfDiagonal(myMatrix);
        assertEquals(result, sum);
    }
}
