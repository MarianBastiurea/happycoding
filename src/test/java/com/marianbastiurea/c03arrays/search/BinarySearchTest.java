package com.marianbastiurea.c03arrays.search;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

 class BinarySearchTest {
    @Test
    void given2AsTargetShouldReturns4AsItsPosition() {
        int[] myArray = {-100, -20, 0, 1, 2, 21, 45, 78, 87, 100};
        int target = 2;
        int resultPosition = 4;
        int result = BinarySearch.findPosition(myArray, target);
        assertEquals(resultPosition, result);
    }
}
