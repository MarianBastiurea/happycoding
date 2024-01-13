package org.example.c05recursion;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class CreateAnArrayWithFirstNNaturalNumbersUsingRecursionTest {
    @Test
    public void first5Elements() {
        int start = 0;
        int numberOfElements = 5;
        int[] resultArray = {0,1, 2, 3, 4};
        int[] result = CreateAnArrayWithFirstNNaturalNumbersUsingRecursion.createAnArray(start, numberOfElements);
        assertArrayEquals(result, resultArray);
    }

    @Test
    public void first10Elements() {
        int start = 0;
        int numberOfElements = 10;
        int[] resultArray = {0,1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] result = CreateAnArrayWithFirstNNaturalNumbersUsingRecursion.createAnArray(start, numberOfElements);
        assertArrayEquals(result, resultArray);
    }
}