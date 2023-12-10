package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;
public class C05P23_Sum_Of_Right_Diagonal_In_Matrix_Test {
    @Test
    public void Two_Rows_And_Two_Columns() {
        int[][] myMatrix = {{1, 2}, {3, 4}};
        int[] sum ={5};
        int[] result = C05P23_Sum_Of_Right_Diagonal_In_Matrix.Sum_Of_Diagonal(myMatrix);
        assertArrayEquals(result, sum);
    }
    @Test
    public void A4x4Matrix() {
        int[][] myMatrix = {{1,2,3,4},{0,1,3,0},{0,0,10,0},{0,0,0,10}};
        int[] sum ={22};
        int[] result = C05P23_Sum_Of_Right_Diagonal_In_Matrix.Sum_Of_Diagonal(myMatrix);
        assertArrayEquals(result, sum);
    }
}