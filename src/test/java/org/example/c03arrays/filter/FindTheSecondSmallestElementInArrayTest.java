package org.example.c03arrays.filter;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FindTheSecondSmallestElementInArrayTest {
    @Test
    public void fiveElements() {
        int[] myArray = {0, 9, 4, 6, 5};
        int result = FindTheSecondSmallestElementInArray.secondSmallestElement(myArray);
        assertEquals(result, 4);
    }

    @Test
    public void twoElements() {
        int[] myArray = {0, -100};
        int result = FindTheSecondSmallestElementInArray.secondSmallestElement(myArray);
        assertEquals(result, 0);
    }

    @Test
    public void sixElements() {
        int[] myArray = {0, -100, 90, 1, -50, 9};
        int result = FindTheSecondSmallestElementInArray.secondSmallestElement(myArray);
        assertEquals(result, -50);
    }
}
