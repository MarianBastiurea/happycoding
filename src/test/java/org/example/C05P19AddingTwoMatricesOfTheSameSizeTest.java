package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class C05P19AddingTwoMatricesOfTheSameSizeTest {
    @Test
    public void TwoMatrices(){
        int[][] FirstMatrices={{1,2},{3,4}};
        int[][] SecondMatrices={{5,6},{7,8}};
        int[][] ResultMatrices={{6,8},{10,12}};
        int[][] result = C05P19AddingTwoMatricesOfTheSameSize.AddingTwoMatrices(FirstMatrices,SecondMatrices);
        assertArrayEquals(result, ResultMatrices);
    }
    @Test
    public void TwoMatricesWithNegativeNumbers(){
        int[][] FirstMatrices={{-1,2},{-3,4}};
        int[][] SecondMatrices={{5,6},{-7,8}};
        int[][] ResultMatrices={{4,8},{-10,12}};
        int[][] result = C05P19AddingTwoMatricesOfTheSameSize.AddingTwoMatrices(FirstMatrices,SecondMatrices);
        assertArrayEquals(result, ResultMatrices);
    }
}
