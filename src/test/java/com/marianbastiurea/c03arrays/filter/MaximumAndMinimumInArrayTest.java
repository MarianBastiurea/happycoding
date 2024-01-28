package com.marianbastiurea.c03arrays.filter;

import com.marianbastiurea.c03arrays.filter.MaximumAndMinimumInArray;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class MaximumAndMinimumInArrayTest {
    @Test
    public void givenDifferentElementsShouldReturnMaxAndMinAsDifferentNumber() {
        int[] myArray = {45, 25, 21};
        int[] result = MaximumAndMinimumInArray.maximumAndMinimum(myArray);
        assertArrayEquals(result, new int[]{45, 21});
    }

    @Test
    public void givenSameElementsShouldReturnSameNumberAsMaxAndMin() {
        int[] myArray = {1, 1, 1, 1, 1, 1};
        int[] result = MaximumAndMinimumInArray.maximumAndMinimum(myArray);
        assertArrayEquals(result, new int[]{1, 1});
    }
}
