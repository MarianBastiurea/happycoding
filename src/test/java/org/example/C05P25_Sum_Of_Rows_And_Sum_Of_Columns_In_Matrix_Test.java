package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class C05P25_Sum_Of_Rows_And_Sum_Of_Columns_In_Matrix_Test {
    @Test
    public void TwoElementsMatrix(){
        int[][] myMatrix={{1,2},{3,4}};
        int[][] sum={{3,7},{4,6}};
        int[][] result=C05P25_Sum_Of_Rows_And_Sum_Of_Columns_In_Matrix.Sum_Of_Rows_And_Sum_Of_Columns_In_Matrix(myMatrix);
        assertArrayEquals(sum,result);
    }
    @Test
    public void FourElementsMatrix(){
        int[][] myMatrix={{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        int[][] sum={{10,26,42,58},{28,32,36,40}};
        int[][] result=C05P25_Sum_Of_Rows_And_Sum_Of_Columns_In_Matrix.Sum_Of_Rows_And_Sum_Of_Columns_In_Matrix(myMatrix);
        assertArrayEquals(sum,result);
    }
}
