package com.marianbastiurea.c03arrays.filter;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

 class MaximumAndMinimumInArrayTest {
    @Test
    void givenDifferentElementsShouldReturnMaxAndMinAsDifferentNumber() {
        int[] myArray = {45, 25, 21};
        int[] result = MaximumAndMinimumInArray.maximumAndMinimum(myArray);
        assertArrayEquals(new int[]{45, 21}, result);
    }

    @Test
     void givenSameElementsShouldReturnSameNumberAsMaxAndMin() {
        int[] myArray = {1, 1, 1, 1, 1, 1};
        int[] result = MaximumAndMinimumInArray.maximumAndMinimum(myArray);
        assertArrayEquals(new int[]{1, 1}, result);
    }
}
