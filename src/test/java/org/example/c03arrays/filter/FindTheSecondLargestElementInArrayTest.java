package org.example.c03arrays.filter;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FindTheSecondLargestElementInArrayTest {
    @Test
    public void fiveElements() {
        int[] myArray = {2, 9, 1, 4, 6};
        int result = FindTheSecondLargestElementInArray.findSecondLargestElement(myArray);
        assertEquals(result, 6);
    }

    @Test
    public void twoElements() {
        int[] myArray = {100, 2};
        int result = FindTheSecondLargestElementInArray.findSecondLargestElement(myArray);
        assertEquals(result, 2);
    }

    @Test
    public void threeElements() {
        int[] myArray = {100, 9, -2};
        int result = FindTheSecondLargestElementInArray.findSecondLargestElement(myArray);
        assertEquals(result, 9);
    }
}
