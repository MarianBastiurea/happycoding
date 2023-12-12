package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;
public class C05P50_Transform_A_Matrix_Using_Spiral_Path_In_Array_Test {
    @Test
    public void A4X5Matrix(){
        int[][] myMatrix = {{1, 2, 3, 4, 5}, {6, 7, 8, 9, 10}, {11, 12, 13, 14, 15}, {16, 17, 18, 19, 20}};
        int[] ResultArray={1,2,3,4,5,10,15,20,19,18,17,16,11,6,7,8,9,14,13,12};
        int[] result= C05P50_Transform_A_Matrix_Using_Spiral_Path_In_Array.TransformAMatrix(myMatrix);
        assertArrayEquals(result,ResultArray);
    }
    @Test
    public void A2X2Matrix(){
        int[][] myMatrix = {{1, 2},{4,3}};
        int[] ResultArray={1,2,3,4};
        int[] result= C05P50_Transform_A_Matrix_Using_Spiral_Path_In_Array.TransformAMatrix(myMatrix);
        assertArrayEquals(result,ResultArray);
    }
}
