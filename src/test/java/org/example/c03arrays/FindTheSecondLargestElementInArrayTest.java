package org.example.c03arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class FindTheSecondLargestElementInArrayTest {
    @Test
    public void FiveElements() {
        int[] myArray = {2, 9, 1, 4, 6};
        int result = FindTheSecondLargestElementInArray.findSecondLargestElementInArray(myArray);
        assertEquals(result, 6);
    }

    @Test
    public void TwoElements() {
        int[] myArray = {100, 2};
        int result = FindTheSecondLargestElementInArray.findSecondLargestElementInArray(myArray);
        assertEquals(result, 2);
    }

    @Test
    public void ThreeElements() {
        int[] myArray = {100, 9, -2};
        int result = FindTheSecondLargestElementInArray.findSecondLargestElementInArray(myArray);
        assertEquals(result, 9);
    }
}
