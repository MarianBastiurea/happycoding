package org.example.c04matrices.calculate;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class AddingTwoMatricesOfTheSameSizeTest {
    @Test
    public void twoMatrices() {
        int[][] firstMatrix = {{1, 2}, {3, 4}};
        int[][] secondMatrix = {{5, 6}, {7, 8}};
        int[][] resultMatrices = {{6, 8}, {10, 12}};
        int[][] result = AddingTwoMatricesOfTheSameSize.addingTwoMatrices(firstMatrix, secondMatrix);
        assertArrayEquals(result, resultMatrices);
    }

    @Test
    public void twoMatricesWithNegativeNumbers() {
        int[][] firstMatrix = {{-1, 2}, {-3, 4}};
        int[][] secondMatrix = {{5, 6}, {-7, 8}};
        int[][] resultMatrices = {{4, 8}, {-10, 12}};
        int[][] result = AddingTwoMatricesOfTheSameSize.addingTwoMatrices(firstMatrix, secondMatrix);
        assertArrayEquals(result, resultMatrices);
    }
}
