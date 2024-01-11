package org.example.c03arrays.calculate;

import org.example.c03arrays.filter.MaximumAndMinimumInArray;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class MaximumAndMinimumInArrayTest {
    @Test
    public void threeElements() {
        MaximumAndMinimumInArray obj = new MaximumAndMinimumInArray();
        int[] myArray = {45, 25, 21};
        int[] result = obj.maximumAndMinimum(myArray);
        assertArrayEquals(result, new int[]{45, 21});
    }

    @Test
    public void sameElements() {
        MaximumAndMinimumInArray obj = new MaximumAndMinimumInArray();
        int[] myArray = {1, 1, 1, 1, 1, 1};
        int[] result = obj.maximumAndMinimum(myArray);
        assertArrayEquals(result, new int[]{1, 1});
    }
}
