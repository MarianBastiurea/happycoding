package org.example.c02controlflow.generate;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MultiplierTableFrom1ToNumberTest {
    @Test
    public void multiplierTableFrom1to3() {
        int number = 3;
        int[] myArray = {1, 2, 3, 2, 4, 6, 3, 6, 9, 4, 8, 12, 5, 10, 15, 6, 12, 18, 7, 14, 21, 8, 16, 24, 9, 18, 27, 10, 20, 30};
        int[] result = MultiplierTableFrom1ToNumber.multiplyNumber(number);
        assertArrayEquals(myArray, result);
    }

    @Test
    public void multiplierTableFrom1to1() {
        int number = 1;
        int[] myArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] result = MultiplierTableFrom1ToNumber.multiplyNumber(number);
        assertArrayEquals(myArray, result);
    }
}
