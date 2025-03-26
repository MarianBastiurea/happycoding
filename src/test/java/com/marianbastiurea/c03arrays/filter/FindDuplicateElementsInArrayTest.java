package com.marianbastiurea.c03arrays.filter;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FindDuplicateElementsInArrayTest {
    @Test
    public void noDuplicatesElements() {
        int[] myArray = {1, 2, 3, 4, 5};
        int numberOfDuplicates = 0;
        int result = FindDuplicateElementsInArray.findDuplicate(myArray);
        assertEquals(numberOfDuplicates, result);
    }

    @Test
    public void oneDuplicatesElements() {
        int[] myArray = {1, 2, 3, 4, 5, 1};
        int numberOfDuplicates = 1;
        int result = FindDuplicateElementsInArray.findDuplicate(myArray);
        assertEquals(numberOfDuplicates, result);
    }
}
