package org.example.c03Arrays;

import org.example.c03arrays.CheckIfTwoMatrixAreEquals;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class CheckIfTwoMatrixAreEqualsTest {
    @Test
    public void ThreeElementMatrix() {
        int[][] FirstMatrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int[][] SecondMatrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        boolean result = CheckIfTwoMatrixAreEquals.checkTwoMatrix(FirstMatrix, SecondMatrix);
        assertTrue(result);
    }

    @Test
    public void EmptyMatrix() {
        int[][] FirstMatrix = {{}};
        int[][] SecondMatrix = {{}};
        boolean result = CheckIfTwoMatrixAreEquals.checkTwoMatrix(FirstMatrix, SecondMatrix);
        assertTrue(result);
    }

    @Test
    public void oneElementMatrix() {
        int[][] FirstMatrix = {{1}};
        int[][] SecondMatrix = {{1}};
        boolean result = CheckIfTwoMatrixAreEquals.checkTwoMatrix(FirstMatrix, SecondMatrix);
        assertTrue(result);
    }
}
