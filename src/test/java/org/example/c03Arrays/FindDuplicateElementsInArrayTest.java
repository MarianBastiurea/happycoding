package org.example.c03Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.example.c03arrays.FindDuplicateElementsInArray;
import org.junit.jupiter.api.Test;

public class FindDuplicateElementsInArrayTest {
    @Test
    public void noDuplicatesElements() {
        int[] myArray = {1, 2, 3, 4, 5};
        int numberOfDuplicates = 0;
        int result = FindDuplicateElementsInArray.FindDuplicate(myArray);
        assertEquals(numberOfDuplicates, result);
    }

    @Test
    public void OneDuplicatesElements() {
        int[] myArray = {1, 2, 3, 4, 5, 1};
        int numberOfDuplicates = 1;
        int result = FindDuplicateElementsInArray.FindDuplicate(myArray);
        assertEquals(numberOfDuplicates, result);
    }

    @Test
    public void AllDuplicatesElements() {
        int[] myArray = {1, 1, 1, 1};
        int numberOfDuplicates = 4;
        int result = FindDuplicateElementsInArray.FindDuplicate(myArray);
        assertEquals(numberOfDuplicates, result);
    }

    @Test
    public void threeDuplicatesElements() {
        int[] myArray = {1, 1, 1, 6, 8, 9};
        int numberOfDuplicates = 3;
        int result = FindDuplicateElementsInArray.FindDuplicate(myArray);
        assertEquals(numberOfDuplicates, result);
    }
}
