package org.example.c03Arrays;

import org.example.c03arrays.MaximumAndMinimumInArray;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class MaximumAndMinimumInArrayTest {
    @Test
    public void ThreeElements() {
        MaximumAndMinimumInArray obj = new MaximumAndMinimumInArray();
        int[] myArray ={45,25,21};
        int[] result = obj.MaximumAndMinimum(myArray);
        assertArrayEquals(result, new int[]{45, 21});
    }
    @Test
    public void SameElements() {
        MaximumAndMinimumInArray obj = new MaximumAndMinimumInArray();
        int[] myArray ={1,1,1,1,1,1};
        int[] result = obj.MaximumAndMinimum(myArray);
        assertArrayEquals(result, new int[]{1,1});
    }
}
