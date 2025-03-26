package com.marianbastiurea.c03arrays.insert;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class StoreElementsInArrayTest {
    @Test
    public void given0AsNumberShouldBeAnArrayWithFirst10Integers() {
        int number = 0;
        int[] myArray = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] result = StoreElementsInArray.storeElements(number);
        assertArrayEquals(result, myArray);
    }
}
