package org.example.c04matrices.verify;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;

public class CheckIfTwoMatrixAreEqualsTest {
    @Test
    public void threeElementMatrix() {
        int[][] firstMatrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int[][] secondMatrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        boolean result = CheckIfTwoMatrixAreEquals.checkTwoMatrix(firstMatrix, secondMatrix);
        assertTrue(result);
    }

    @Test
    public void emptyMatrix() {
        int[][] firstMatrix = {{}};
        int[][] secondMatrix = {{}};
        boolean result = CheckIfTwoMatrixAreEquals.checkTwoMatrix(firstMatrix, secondMatrix);
        assertTrue(result);
    }

    @Test
    public void oneElementMatrix() {
        int[][] firstMatrix = {{1}};
        int[][] secondMatrix = {{1}};
        boolean result = CheckIfTwoMatrixAreEquals.checkTwoMatrix(firstMatrix, secondMatrix);
        assertTrue(result);
    }
    @Test
    public void notSameDimensionMatrix() {
        int[][] firstMatrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int[][] secondMatrix = {{1, 2, 3}, {7, 8, 9}};
        boolean result = CheckIfTwoMatrixAreEquals.checkTwoMatrix(firstMatrix, secondMatrix);
        assertFalse(result);
    }
    @Test
    public void notSameElementsMatrix() {
        int[][] firstMatrix = {{1, 2, 3}, {4, 5, 6}};
        int[][] secondMatrix = {{1, 2, 3}, {7, 8, 9}};
        boolean result = CheckIfTwoMatrixAreEquals.checkTwoMatrix(firstMatrix, secondMatrix);
        assertFalse(result);
    }
}
