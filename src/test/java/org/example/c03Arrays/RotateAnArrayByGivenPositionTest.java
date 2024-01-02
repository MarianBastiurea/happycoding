package org.example.c03Arrays;

import org.example.c03arrays.RotateAnArrayByGivenPosition;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class RotateAnArrayByGivenPositionTest {
    @Test
    public void ElevenElements() {
        int[] myArray = {0, 3, 6, 9, 12, 14, 18, 20, 22, 25, 27};
        int[] resultArray = {12, 14, 18, 20, 22, 25, 27, 0, 3, 6, 9};
        int position = 4;
        int[] result = RotateAnArrayByGivenPosition.RotateArray(myArray, position);
        assertArrayEquals(resultArray, result);
    }

    @Test
    public void ThreeElements() {
        int[] myArray = {0, 3, 6};
        int[] resultArray = {3, 6, 0};
        int position = 1;
        int[] result = RotateAnArrayByGivenPosition.RotateArray(myArray, position);
        assertArrayEquals(resultArray, result);
    }
}
