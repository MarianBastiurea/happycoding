package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class C05P24_Sum_Of_Left_Diagonal_In_Matrix_Test {
    @Test
    public void Two_Rows_And_Two_Columns() {
        int[][] myMatrix = {{1, 2}, {3, 4}};
        int sum =5;
        int result = C05P24_Sum_Of_Left_Diagonal_In_Matrix.Sum_Of_Diagonal(myMatrix);
        assertEquals(result, sum);
    }
    @Test
    public void A4x4Matrix() {
        int[][] myMatrix = {{1,2,3,4},{0,1,3,0},{0,0,10,0},{0,0,0,10}};
        int sum =7;
        int result = C05P24_Sum_Of_Left_Diagonal_In_Matrix.Sum_Of_Diagonal(myMatrix);
        assertEquals(result, sum);
    }
    @Test
    public void EmptyMatrix() {
        int[][] myMatrix = {{}};
        int sum =0;
        int result = C05P24_Sum_Of_Left_Diagonal_In_Matrix.Sum_Of_Diagonal(myMatrix);
        assertEquals(result, sum);
    }
}
