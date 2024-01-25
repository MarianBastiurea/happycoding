package org.example.c04matrices.calculate;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SumOfRightDiagonalInMatrixTest {
    @Test
    public void givenAMatrixShouldReturnSumOfRightDiagonal() {
        int[][] myMatrix = {{1, 2}, {3, 4}};
        int sum = 5;
        int result = SumOfRightDiagonalInMatrix.sumOfDiagonal(myMatrix);
        assertEquals(result, sum);
    }
}
