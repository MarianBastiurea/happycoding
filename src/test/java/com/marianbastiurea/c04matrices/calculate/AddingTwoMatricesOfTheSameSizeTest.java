package com.marianbastiurea.c04matrices.calculate;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class AddingTwoMatricesOfTheSameSizeTest {
    @Test
     void givenTwoMatricesShouldReturnAMatrixWithElementsBeingSumOfElementsFromFirst2Matrices() {
        int[][] firstMatrix = {{1, 2}, {3, 4}};
        int[][] secondMatrix = {{5, 6}, {7, 8}};
        int[][] resultMatrices = {{6, 8}, {10, 12}};
        int[][] result = AddingTwoMatricesOfTheSameSize.addingTwoMatrices(firstMatrix, secondMatrix);
        assertArrayEquals(resultMatrices, result);
    }
}
