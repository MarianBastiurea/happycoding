package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class C05P17FindTheSecondSmallestElementInAnArrayTest {
    @Test
    public void FiveElements() {
        int[] myArray = {0,9,4,6,5};
        int[] result = C05P17FindTheSecondSmallestElementInAnArray.SecondSmallestElementInAnArray(myArray);
        assertArrayEquals(result, new int[]{4});
    }
    @Test
    public void TwoElements() {
        int[] myArray = {0,-100};
        int[] result = C05P17FindTheSecondSmallestElementInAnArray.SecondSmallestElementInAnArray(myArray);
        assertArrayEquals(result, new int[]{0});
    }
    public void SixElements() {
        int[] myArray = {0,-100,90,1,-50,9};
        int[] result = C05P17FindTheSecondSmallestElementInAnArray.SecondSmallestElementInAnArray(myArray);
        assertArrayEquals(result, new int[]{-50});
    }
}
