package com.marianbastiurea.c05recursion;

import com.marianbastiurea.c05recursion.CreateAnArrayWithFirstNNaturalNumbersUsingRecursion;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class CreateAnArrayWithFirstNNaturalNumbersUsingRecursionTest {
    @Test
    public void given0AsFirstElementsShouldReturnAnArrayWithFirst5Integers() {
        int start = 0;
        int numberOfElements = 5;
        int[] resultArray = {0, 1, 2, 3, 4};
        int[] result = CreateAnArrayWithFirstNNaturalNumbersUsingRecursion.createAnArray(start, numberOfElements);
        assertArrayEquals(result, resultArray);
    }
}
