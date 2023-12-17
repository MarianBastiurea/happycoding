package org.example;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class How_Many_Times_An_Elements_Is_Repeating_In_An_Array_Test {
    @Test
    public void SevenElements(){
        int[] myArray={2, 7, 0,0,4, 7, 8, 3, 4, 7, 2, 3, 7, 1, 4, 10, 10,11,11,2};
        int[][] resultMatrix={{2,2},{7,3},{0,1},{4,2},{3,1},{10,1},{11,1}};
        int[][] result=How_Many_Times_An_Elements_Is_Repeating_In_An_Array.How_Many_Times(myArray);
        assertArrayEquals(resultMatrix, result);
    }

    @Test
    public void oneElements(){
        int[] myArray={2,34,77,2,2};
        int[][] resultMatrix=new int[1][2];
        resultMatrix[0][0]=2;
        resultMatrix[0][1]=2;
        int[][] result=How_Many_Times_An_Elements_Is_Repeating_In_An_Array.How_Many_Times(myArray);
        assertArrayEquals(resultMatrix, result);
    }
    @Test
    public void NoElements(){
        int[] myArray={2,34,77,22,21};
        int[][] resultMatrix=new int[0][0];
        int[][] result=How_Many_Times_An_Elements_Is_Repeating_In_An_Array.How_Many_Times(myArray);
        assertArrayEquals(resultMatrix, result);
    }
}
