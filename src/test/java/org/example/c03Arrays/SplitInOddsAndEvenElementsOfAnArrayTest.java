package org.example.c03Arrays;

import org.example.c03arrays.SplitInOddsAndEvenElementsOfAnArray;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class SplitInOddsAndEvenElementsOfAnArrayTest {
    @Test
    public void fiveElements() {
        SplitInOddsAndEvenElementsOfAnArray obj = new SplitInOddsAndEvenElementsOfAnArray();
        int[] myArray = {1, 2, 3, 4, 5, 6};
        int[][] result = obj.OddsAndEven(myArray);
        assertArrayEquals(result, new int[][]{{2, 4, 6}, {1, 3, 5}});
    }
}
