package com.marianbastiurea.c04matrices.calculate;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

 class SubtractMatricesTest {
    @Test
     void givenTwoMatricesShouldReturnAMatrixWithItsElementsResultAsSubtractOfElementsFromGivenMatrices() {
        int[][] firstMatrices = {{5, 6}, {7, 8}};
        int[][] secondMatrices = {{1, 2}, {3, 4}};
        int[][] resultMatrices = {{4, 4}, {4, 4}};
        int[][] result = SubtractMatrices.subtract(firstMatrices, secondMatrices);
        assertArrayEquals(resultMatrices, result);
    }

    @Test
    void givenTwoEmptyMatricesShouldResultAnEmptyMatrix() {
        int[][] firstMatrices = {{}, {}};
        int[][] secondMatrices = {{}, {}};
        int[][] resultMatrices = {{}, {}};
        int[][] result = SubtractMatrices.subtract(firstMatrices, secondMatrices);
        assertArrayEquals(resultMatrices, result);
    }

    @Test
     void givenTwoSingleElementMatricesShouldResultOneElementMatrixWhichElementIsAResultOfSubtractionOfElementsFromGivenMatrix() {
        int[][] firstMatrices = {{5}};
        int[][] secondMatrices = {{2}};
        int[][] resultMatrices = {{3}};
        int[][] result = SubtractMatrices.subtract(firstMatrices, secondMatrices);
        assertArrayEquals(resultMatrices, result);
    }
}









