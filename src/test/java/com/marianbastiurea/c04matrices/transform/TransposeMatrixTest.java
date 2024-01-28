package com.marianbastiurea.c04matrices.transform;

import com.marianbastiurea.c04matrices.transform.TransposeMatrix;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;


public class TransposeMatrixTest {


    @Test
    public void givenAMatrixShouldReturnASameMatrixWithElementTransposed() {
        int[][] myMatrix = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}, {13, 14, 15, 16}};
        int[][] resultMatrix = {{1, 5, 9, 13}, {2, 6, 10, 14}, {3, 7, 11, 15}, {4, 8, 12, 16}};
        int[][] result = TransposeMatrix.transposeAMatrix(myMatrix);
        assertArrayEquals(resultMatrix, result);
    }
}
