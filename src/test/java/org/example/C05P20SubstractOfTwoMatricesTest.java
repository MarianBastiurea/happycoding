package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class C05P20SubstractOfTwoMatricesTest {
    @Test
    public void TwoMatrices() {
        int[][] FirstMatrices ={{5,6},{7,8}};
        int[][] SecondMatrices ={{1,2},{3,4}};
        int[][] ResultMatrices ={{4,4},{4,4}};
       int[][] result = C05P20SubstractOfTwoMatrices.SubstractOftwoMatrices(FirstMatrices, SecondMatrices);
        assertArrayEquals(ResultMatrices, result);
    }
    @Test
    public void SubstractEmptyMatrices() {
        int[][] FirstMatrices ={{},{}};
        int[][] SecondMatrices ={{},{}};
        int[][] ResultMatrices ={{},{}};
        int[][] result = C05P20SubstractOfTwoMatrices.SubstractOftwoMatrices(FirstMatrices, SecondMatrices);
        assertArrayEquals(ResultMatrices, result);
    }
    @Test
    public void SingleElementMatrices() {
        int[][] FirstMatrices ={{5}};
        int[][] SecondMatrices ={{2}};
        int[][] ResultMatrices ={{3}};
        int[][] result = C05P20SubstractOfTwoMatrices.SubstractOftwoMatrices(FirstMatrices, SecondMatrices);
        assertArrayEquals(ResultMatrices, result);
    }
    @Test
    public void Substract2x2Matrices() {
        int[][] FirstMatrices ={{1,2},{3,4}};
        int[][] SecondMatrices ={{1,1},{1,1}};
        int[][] ResultMatrices ={{0,1},{2,3}};
        int[][] result = C05P20SubstractOfTwoMatrices.SubstractOftwoMatrices(FirstMatrices, SecondMatrices);
        assertArrayEquals(ResultMatrices, result);
    }
}









