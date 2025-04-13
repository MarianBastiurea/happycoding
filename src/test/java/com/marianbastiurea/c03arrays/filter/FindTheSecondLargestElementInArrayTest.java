package com.marianbastiurea.c03arrays.filter;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

 class FindTheSecondLargestElementInArrayTest {
    @Test
     void givenDifferentNumberShouldReturn1SecondLargestElement() {
        int[] myArray = {2, 9, 1, 4, 6};
        int result = FindTheSecondLargestElementInArray.findSecondLargestElement(myArray);
        assertEquals(6, result);
    }

    @Test
     void givenSameElementsShouldReturnOneOfThemAsSecond() {
        int[] myArray = {2, 2};
        int result = FindTheSecondLargestElementInArray.findSecondLargestElement(myArray);
        assertEquals(2, result);
    }
}
