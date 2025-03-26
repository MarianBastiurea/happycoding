package com.marianbastiurea.c03arrays.filter;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FindTheSecondLargestElementInArrayTest {
    @Test
    public void givenDifferentNumberShouldReturn1SecondLargestElement() {
        int[] myArray = {2, 9, 1, 4, 6};
        int result = FindTheSecondLargestElementInArray.findSecondLargestElement(myArray);
        assertEquals(result, 6);
    }

    @Test
    public void givenSameElementsShouldReturnOneOfThemAsSecond() {
        int[] myArray = {2, 2};
        int result = FindTheSecondLargestElementInArray.findSecondLargestElement(myArray);
        assertEquals(result, 2);
    }
}
