package com.marianbastiurea.c04matrices.verify;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

 class CheckIfTwoMatrixAreEqualsTest {
    @Test
    void given2SameMatricesShouldReturnThatMatricesAreEqual() {
        int[][] firstMatrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int[][] secondMatrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        boolean result = CheckIfTwoMatrixAreEquals.checkTwoMatrix(firstMatrix, secondMatrix);
        assertTrue(result);
    }


    @Test
    void given2MatricesWithDifferentSizesShouldReturnThatMatricesAreNotEqual() {
        int[][] firstMatrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int[][] secondMatrix = {{1, 2, 3}, {7, 8, 9}};
        boolean result = CheckIfTwoMatrixAreEquals.checkTwoMatrix(firstMatrix, secondMatrix);
        assertFalse(result);
    }

    @Test
    void given2MatricesWithDifferentElementsShouldReturnThatMatricesAreNotEqual() {
        int[][] firstMatrix = {{1, 2, 3}, {4, 5, 6}};
        int[][] secondMatrix = {{1, 2, 3}, {7, 8, 9}};
        boolean result = CheckIfTwoMatrixAreEquals.checkTwoMatrix(firstMatrix, secondMatrix);
        assertFalse(result);
    }
}
