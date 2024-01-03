package org.example.c05searchingandsorting;

import org.example.c05searchingandsorting.FindMaximumInAnArrayUsingSelectionSortAlgorithm;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FindMaximumInAnArrayUsingSelectionSortAlgorithmTest {

    @Test
    public void FiveMaxElements() {
        //have to find maximum of elements and
        int[] myArray = {14, 45, 67, 2, 1};
        int maximum = 67;
        int result = FindMaximumInAnArrayUsingSelectionSortAlgorithm.FindMaximumInArray(myArray);
        assertEquals(maximum, result);
    }

    @Test
    public void FiveMaxElementsWithNegativeNumber() {
        //have to find maximum of elements and
        // sort ascending
        int[] myArray = {14, 45, -67, -2, 1};
        int maximum = 45;
        int result = FindMaximumInAnArrayUsingSelectionSortAlgorithm.FindMaximumInArray(myArray);
        assertEquals(maximum, result);
    }
    @Test
    public void OneElement() {
        //have to find maximum of elements and
        // sort ascending
        int[] myArray = {1};
        int maximum = 1;
        int result = FindMaximumInAnArrayUsingSelectionSortAlgorithm.FindMaximumInArray(myArray);
        assertEquals(maximum, result);
    }
}
