package org.example.c03arrays.search;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BinarySearchTest {
    @Test
    public void tenElements() {
        int[] myArray = {-100, -20, 0, 1, 2, 21, 45, 78, 87, 100};
        int Target = 2;
        int resultPosition = 4;
        int result = BinarySearch.findPosition(myArray, Target);
        assertEquals(resultPosition, result);
    }
    @Test
    public void fiveElements() {
        int[] myArray = {-100, -20, 0, 0, 0};
        int Target = 0;
        int resultPosition = 2;
        int result = BinarySearch.findPosition(myArray, Target);
        assertEquals(resultPosition, result);
    }
}
