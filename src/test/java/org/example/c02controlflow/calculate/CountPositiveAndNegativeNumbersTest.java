package org.example.c02controlflow.calculate;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CountPositiveAndNegativeNumbersTest {
    @Test
    public void fourWithTwo() {
        int[] myArray = {-1, 2, -4, 90, 0, 9};
        int[] resultCount = {4, 2};
        int[] result = CountPositiveAndNegativeNumbers.count(myArray);
        assertArrayEquals(result, resultCount);
    }

    @Test
    public void twoWithFour() {
        int[] myArray = {-1, -2, -4, -90, 0, 9};
        int[] resultCount = {2, 4};
        int[] result = CountPositiveAndNegativeNumbers.count(myArray);
        assertArrayEquals(result, resultCount);
    }

    @Test
    public void oneWithZero() {
        int[] myArray = {0};
        int[] resultCount = {1, 0};
        int[] result = CountPositiveAndNegativeNumbers.count(myArray);
        assertArrayEquals(result, resultCount);
    }
}
