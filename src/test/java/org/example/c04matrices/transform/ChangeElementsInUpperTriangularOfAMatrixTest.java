package org.example.c04matrices.transform;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class ChangeElementsInUpperTriangularOfAMatrixTest {
    @Test
    public void givenAMatrixShouldReplaceElementsInUpperTriangularWith0() {
        int[][] myMatrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int[][] resultMatrix = {{1, 0, 0}, {4, 5, 0}, {7, 8, 9}};
        int[][] result = ChangeElementsInUpperTriangularOfAMatrix.changeElements(myMatrix);
        assertArrayEquals(result, resultMatrix);
    }
}
