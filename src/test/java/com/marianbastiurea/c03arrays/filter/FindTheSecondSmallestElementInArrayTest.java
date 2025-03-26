package com.marianbastiurea.c03arrays.filter;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FindTheSecondSmallestElementInArrayTest {
    @Test
    public void givenFiveDifferentElementsShouldReturnOneAsSecondSmallestElement() {
        int[] myArray = {0, 9, 4, 6, 5};
        int result = FindTheSecondSmallestElementInArray.secondSmallestElement(myArray);
        assertEquals(result, 4);
    }
}
