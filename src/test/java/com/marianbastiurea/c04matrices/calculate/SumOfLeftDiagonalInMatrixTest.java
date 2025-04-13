package com.marianbastiurea.c04matrices.calculate;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

 class SumOfLeftDiagonalInMatrixTest {
    @Test
    void givenAMatrixShouldReturnSumOfLeftDiagonal() {
        int[][] myMatrix = {{1, 2}, {3, 4}};
        int sum = 5;
        int result = SumOfLeftDiagonalInMatrix.sumOfDiagonal(myMatrix);
        assertEquals(sum, result);
    }

    @Test
    void givenEmptyMatrixSumShouldBe0() {
        int[][] myMatrix = {{}};
        int sum = 0;
        int result = SumOfLeftDiagonalInMatrix.sumOfDiagonal(myMatrix);
        assertEquals(sum, result);
    }
}
