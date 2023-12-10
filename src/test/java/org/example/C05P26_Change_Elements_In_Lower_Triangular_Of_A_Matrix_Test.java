package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class C05P26_Change_Elements_In_Lower_Triangular_Of_A_Matrix_Test {
    @Test
    public  void ThreeElementsMatrix(){
        //Changes elements with 0
        int[][] myMatrix={{1,2,3},{4,5,6},{7,8,9}};
        int[][] resultMatrix={{1,2,3},{0,5,6},{0,0,9}};
        int[][] result=C05P26_Change_Elements_In_Lower_Triangular_Of_A_Matrix.Change_Elements(myMatrix);
        assertArrayEquals(result,resultMatrix);
    }
    @Test
    public  void FourElementsMatrix(){
        //Changes elements with 0
        int[][] myMatrix={{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        int[][] resultMatrix={{1,2,3,4},{0,6,7,8},{0,0,11,12},{0,0,0,16}};
        int[][] result=C05P26_Change_Elements_In_Lower_Triangular_Of_A_Matrix.Change_Elements(myMatrix);
        assertArrayEquals(result,resultMatrix);
    }
}
