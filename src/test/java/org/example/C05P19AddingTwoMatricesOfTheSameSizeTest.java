package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class C05P19AddingTwoMatricesOfTheSameSizeTest {
    @Test
    public void TwoMatrices(){
        C05P19AddingTwoMatricesOfTheSameSize obj=new C05P19AddingTwoMatricesOfTheSameSize();
        int[][] FirstMatrices=new int[2][2];
        int[][] SecondMatrices=new int[2][2];
        int[][] ResultMatrices=new int[2][2];
        FirstMatrices[0][0]=1;
        FirstMatrices[0][1]=2;
        FirstMatrices[1][0]=3;
        FirstMatrices[1][1]=4;
        SecondMatrices[0][0]=5;
        SecondMatrices[0][1]=6;
        SecondMatrices[1][0]=7;
        SecondMatrices[1][1]=8;
        ResultMatrices[0][0]=6;
        ResultMatrices[0][1]=8;
        ResultMatrices[1][0]=10;
        ResultMatrices[1][1]=12;
        int[][] result = obj.AddingTwoMatrices(FirstMatrices,SecondMatrices);
        assertArrayEquals(result, ResultMatrices);
    }
}
