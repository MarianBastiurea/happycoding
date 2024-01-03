package org.example.c05searchingandsorting;

import org.example.c05searchingandsorting.BinarySearch;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BinarySearchTest {
    @Test
    public void TenElements() {
        int[] myArray = {-100, -20, 0, 1, 2, 21, 45, 78, 87, 100};
        int Target = 2;
        int resultPosition = 4;
        int result = BinarySearch.FindPosition(myArray, Target);
        assertEquals(resultPosition, result);
    }
    @Test
    public void FiveElements() {
        int[] myArray = {-100, -20, 0, 0, 0};
        int Target = 0;
        int resultPosition = 2;
        int result = BinarySearch.FindPosition(myArray, Target);
        assertEquals(resultPosition, result);
    }
}
