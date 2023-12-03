package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class C05P20SubstractionOfTwoMatricesTest {
    @Test
    public void TwoMatrices()

    {
        C05P20SubstractionOfTwoMatricesTest obj = new C05P20SubstractionOfTwoMatricesTest();
        int[][] FirstMatrices = new int[2][2];
        int[][] SecondMatrices = new int[2][2];
        int[][] ResultMatrices = new int[2][2];
        FirstMatrices[0][0] = 5;
        FirstMatrices[0][1] = 6;
        FirstMatrices[1][0] = 7;
        FirstMatrices[1][1] = 8;
        SecondMatrices[0][0] = 1;
        SecondMatrices[0][1] = 2;
        SecondMatrices[1][0] = 3;
        SecondMatrices[1][1] = 4;
        ResultMatrices[0][0] = 4;
        ResultMatrices[0][1] = 4;
        ResultMatrices[1][0] = 4;
        ResultMatrices[1][1] = 4;
       // int[][] result = obj.SubstractionOftwoMatrices(FirstMatrices, SecondMatrices);
       // asserArrayEquals(result, MatriceSubstraction);
    }
}









