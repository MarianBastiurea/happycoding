package org.example.c03arrays;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class TransformAMatrixUsingSpiralPathInArrayTest {
    @Test
    public void a4X5Matrix() {
        int[][] myMatrix = {{1, 2, 3, 4, 5}, {6, 7, 8, 9, 10}, {11, 12, 13, 14, 15}, {16, 17, 18, 19, 20}};
        int[] resultArray = {1, 2, 3, 4, 5, 10, 15, 20, 19, 18, 17, 16, 11, 6, 7, 8, 9, 14, 13, 12};
        int[] result = TransformAMatrixUsingSpiralPathInArray.transformAMatrix(myMatrix);
        assertArrayEquals(result, resultArray);
    }

    @Test
    public void a2X2Matrix() {
        int[][] myMatrix = {{1, 2}, {4, 3}};
        int[] resultArray = {1, 2, 3, 4};
        int[] result = TransformAMatrixUsingSpiralPathInArray.transformAMatrix(myMatrix);
        assertArrayEquals(result, resultArray);
    }
}
