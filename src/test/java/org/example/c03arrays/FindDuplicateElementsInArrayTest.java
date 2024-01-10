package org.example.c03arrays;

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

    @Test
    public void threeDuplicatesElements() {
        int[] myArray = {2, 1, 1, 1, 1};
        int numberOfDuplicates = 3;
        int result = FindDuplicateElementsInArray.findDuplicate(myArray);
        assertEquals(numberOfDuplicates, result);
    }

    @Test
    public void twoDuplicatesElements() {
        int[] myArray = {1, 1, 1, 6, 8, 9};
        int numberOfDuplicates = 2;
        int result = FindDuplicateElementsInArray.findDuplicate(myArray);
        assertEquals(numberOfDuplicates, result);
    }
}
