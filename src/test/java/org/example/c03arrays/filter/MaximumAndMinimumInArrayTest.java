package org.example.c03arrays.filter;

import org.example.c03arrays.filter.MaximumAndMinimumInArray;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class MaximumAndMinimumInArrayTest {
    @Test
    public void givenDifferentElementsShouldReturnMaxAndMinAsDifferentNumber() {
        MaximumAndMinimumInArray obj = new MaximumAndMinimumInArray();
        int[] myArray = {45, 25, 21};
        int[] result = obj.maximumAndMinimum(myArray);
        assertArrayEquals(result, new int[]{45, 21});
    }

    @Test
    public void givenSameElementsShouldReturnSameNumberAsMaxAndMin() {
        MaximumAndMinimumInArray obj = new MaximumAndMinimumInArray();
        int[] myArray = {1, 1, 1, 1, 1, 1};
        int[] result = obj.maximumAndMinimum(myArray);
        assertArrayEquals(result, new int[]{1, 1});
    }
}
