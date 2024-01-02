package org.example.c03Arrays;

import org.example.c03arrays.SumOfRightDiagonalInMatrix;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SumOfRightDiagonalInMatrixTest {
    @Test
    public void Two_Rows_And_Two_Columns() {
        int[][] myMatrix = {{1, 2}, {3, 4}};
        int sum = 5;
        int result = SumOfRightDiagonalInMatrix.Sum_Of_Diagonal(myMatrix);
        assertEquals(result, sum);
    }

    @Test
    public void A4x4Matrix() {
        int[][] myMatrix = {{1, 2, 3, 4}, {0, 1, 3, 0}, {0, 0, 10, 0}, {0, 0, 0, 10}};
        int sum = 22;
        int result = SumOfRightDiagonalInMatrix.Sum_Of_Diagonal(myMatrix);
        assertEquals(result, sum);
    }
}
