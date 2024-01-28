package com.marianbastiurea.c03arrays.transform;

import com.marianbastiurea.c03arrays.transform.ReverseArray;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ReverseArrayTest {

    @Test
    public void givenAnArrayShouldReturnSameArrayInReverseOrder() {
        int[] myArray = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] resultArray = {9, 8, 7, 6, 5, 4, 3, 2, 1, 0};
        int[] result = ReverseArray.reverse(myArray);
        assertArrayEquals(result, resultArray);
    }
}
