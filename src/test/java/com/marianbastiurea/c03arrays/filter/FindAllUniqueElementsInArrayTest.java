package com.marianbastiurea.c03arrays.filter;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class FindAllUniqueElementsInArrayTest {
    @Test
    public void given2sameElementsInAnArrayWith5ElementsShouldReturn3UniqueElements() {
        int[] myArray = {3, 2, 2, -5, 0};
        int[] result = FindAllUniqueElementsInArray.uniqueElement(myArray);
        assertArrayEquals(result, new int[]{3, -5, 0});
    }

    @Test
    public void givenSameElementsInAnArrayShouldReturn0UniqueElements() {
        int[] myArray = {2, 2, 2, 2,};
        int[] result = FindAllUniqueElementsInArray.uniqueElement(myArray);
        assertArrayEquals(result, new int[]{});
    }
}
