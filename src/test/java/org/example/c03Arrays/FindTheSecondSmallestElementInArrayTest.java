package org.example.c03Arrays;

import org.example.c03arrays.FindTheSecondSmallestElementInArray;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FindTheSecondSmallestElementInArrayTest {
    @Test
    public void FiveElements() {
        int[] myArray = {0, 9, 4, 6, 5};
        int result = FindTheSecondSmallestElementInArray.SecondSmallestElementInAnArray(myArray);
        assertEquals(result, 4);
    }

    @Test
    public void TwoElements() {
        int[] myArray = {0, -100};
        int result = FindTheSecondSmallestElementInArray.SecondSmallestElementInAnArray(myArray);
        assertEquals(result, 0);
    }

    public void SixElements() {
        int[] myArray = {0, -100, 90, 1, -50, 9};
        int result = FindTheSecondSmallestElementInArray.SecondSmallestElementInAnArray(myArray);
        assertEquals(result, -50);
    }
}
