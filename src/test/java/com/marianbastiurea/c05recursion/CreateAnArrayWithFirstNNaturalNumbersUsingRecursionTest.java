package com.marianbastiurea.c05recursion;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class CreateAnArrayWithFirstNNaturalNumbersUsingRecursionTest {
    @Test
     void given0AsFirstElementsShouldReturnAnArrayWithFirst5Integers() {
        int start = 0;
        int numberOfElements = 5;
        int[] resultArray = {0, 1, 2, 3, 4};
        int[] result = CreateAnArrayWithFirstNNaturalNumbersUsingRecursion.createAnArray(start, numberOfElements);
        assertArrayEquals(resultArray, result);
    }
}
