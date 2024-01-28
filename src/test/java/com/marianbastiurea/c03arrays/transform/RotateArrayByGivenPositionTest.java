package com.marianbastiurea.c03arrays.transform;

import com.marianbastiurea.c03arrays.transform.RotateArrayByGivenPosition;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class RotateArrayByGivenPositionTest {
    @Test
    public void givenPositionForRotateAnArrayShouldReturnSameArrayWithElementsRotated() {
        int[] myArray = {0, 3, 6, 9, 12, 14, 18, 20, 22, 25, 27};
        int[] resultArray = {12, 14, 18, 20, 22, 25, 27, 0, 3, 6, 9};
        int position = 4;
        int[] result = RotateArrayByGivenPosition.rotateArray(myArray, position);
        assertArrayEquals(resultArray, result);
    }
}
