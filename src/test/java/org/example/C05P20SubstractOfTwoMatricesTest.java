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
    @Test
    public void Substract4x4Matrices() {
        int[][] FirstMatrices ={{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        int[][] SecondMatrices ={{16,15,14,13},{12,11,10,9},{8,7,6,5},{4,3,2,1}};
        int[][] ResultMatrices ={{-15,-13,-11,-9},{-7,-5,-3,-1},{1,3,5,7},{9,11,13,15}};
        int[][] result = C05P20SubstractOfTwoMatrices.SubstractOftwoMatrices(FirstMatrices, SecondMatrices);
        assertArrayEquals(ResultMatrices, result);
    }
}









