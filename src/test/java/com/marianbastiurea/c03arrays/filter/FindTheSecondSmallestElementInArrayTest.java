package com.marianbastiurea.c03arrays.filter;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

 class FindTheSecondSmallestElementInArrayTest {
    @Test
     void givenFiveDifferentElementsShouldReturnOneAsSecondSmallestElement() {
        int[] myArray = {0, 9, 4, 6, 5};
        int result = FindTheSecondSmallestElementInArray.secondSmallestElement(myArray);
        assertEquals(4, result);
    }
}
