package com.marianbastiurea.c04matrices.calculate;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SumOfLeftDiagonalInMatrixTest {
    @Test
    public void givenAMatrixShouldReturnSumOfLeftDiagonal() {
        int[][] myMatrix = {{1, 2}, {3, 4}};
        int sum = 5;
        int result = SumOfLeftDiagonalInMatrix.sumOfDiagonal(myMatrix);
        assertEquals(result, sum);
    }

    @Test
    public void givenEmptyMatrixSumShouldBe0() {
        int[][] myMatrix = {{}};
        int sum = 0;
        int result = SumOfLeftDiagonalInMatrix.sumOfDiagonal(myMatrix);
        assertEquals(result, sum);
    }
}
