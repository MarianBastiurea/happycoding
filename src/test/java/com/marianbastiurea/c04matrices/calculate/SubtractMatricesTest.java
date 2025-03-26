package com.marianbastiurea.c04matrices.calculate;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class SubtractMatricesTest {
    @Test
    public void givenTwoMatricesShouldReturnAMatrixWithItsElementsResultAsSubtractOfElementsFromGivenMatrices() {
        int[][] FirstMatrices = {{5, 6}, {7, 8}};
        int[][] SecondMatrices = {{1, 2}, {3, 4}};
        int[][] ResultMatrices = {{4, 4}, {4, 4}};
        int[][] result = SubtractMatrices.subtract(FirstMatrices, SecondMatrices);
        assertArrayEquals(ResultMatrices, result);
    }

    @Test
    public void givenTwoEmptyMatricesShouldResultAnEmptyMatrix() {
        int[][] FirstMatrices = {{}, {}};
        int[][] SecondMatrices = {{}, {}};
        int[][] ResultMatrices = {{}, {}};
        int[][] result = SubtractMatrices.subtract(FirstMatrices, SecondMatrices);
        assertArrayEquals(ResultMatrices, result);
    }

    @Test
    public void givenTwoSingleElementMatricesShouldResultOneElementMatrixWhichElementIsAResultOfSubtractionOfElementsFromGivenMatrix() {
        int[][] FirstMatrices = {{5}};
        int[][] SecondMatrices = {{2}};
        int[][] ResultMatrices = {{3}};
        int[][] result = SubtractMatrices.subtract(FirstMatrices, SecondMatrices);
        assertArrayEquals(ResultMatrices, result);
    }
}









