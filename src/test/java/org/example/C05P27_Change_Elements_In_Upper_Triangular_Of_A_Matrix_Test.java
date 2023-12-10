package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class C05P27_Change_Elements_In_Upper_Triangular_Of_A_Matrix_Test {
    @Test
    public void Three_Elements_Matrix(){
        int[][] myMatrix={{1,2,3},{4,5,6},{7,8,9}};
        int[][] resultMatrix={{1,0,0},{4,5,0},{7,8,9}};
        int[][] result=C05P27_Change_Elements_In_Upper_Triangular_Of_A_Matrix.Change_Elements(myMatrix);
        assertArrayEquals(result,resultMatrix);
    }
    @Test
    public void Four_Elements_Matrix(){
        int[][] myMatrix={{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        int[][] resultMatrix={{1,0,0,0},{5,6,0,0},{9,10,11,0},{13,14,15,16}};
        int[][] result=C05P27_Change_Elements_In_Upper_Triangular_Of_A_Matrix.Change_Elements(myMatrix);
        assertArrayEquals(result,resultMatrix);
    }
}
