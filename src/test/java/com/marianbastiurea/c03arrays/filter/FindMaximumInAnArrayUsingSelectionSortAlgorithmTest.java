package com.marianbastiurea.c03arrays.filter;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

 class FindMaximumInAnArrayUsingSelectionSortAlgorithmTest {

    @Test
     void givenDifferentNumberShouldReturn1Max() {
        //have to find maximum of elements and
        int[] myArray = {14, 45, 67, 2, 1};
        int maximum = 67;
        int result = FindMaximumInAnArrayUsingSelectionSortAlgorithm.findMaximum(myArray);
        assertEquals(maximum, result);
    }

    @Test
     void givenSameNumberShouldReturn1Max() {
        //have to find maximum of elements and
        // sort ascending
        int[] myArray = {0, 0, 0, 0};
        int maximum = 0;
        int result = FindMaximumInAnArrayUsingSelectionSortAlgorithm.findMaximum(myArray);
        assertEquals(maximum, result);
    }
}
