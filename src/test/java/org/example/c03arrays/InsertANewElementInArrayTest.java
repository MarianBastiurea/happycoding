package org.example.c03arrays;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class InsertANewElementInArrayTest {
    @Test
    public void fiveElements() {
        int[] myArray = {2, 5, 7, 9, 11};
        int elementToBeInserted = 8;
        int[] result = InsertANewElementInArray.insertElements(myArray, elementToBeInserted);
        assertArrayEquals(result, new int[]{2, 5, 7, 8, 9, 11});
    }

    @Test
    public void oneElements() {
        int[] myArray = {2};
        int elementToBeInserted = 8;
        int[] result = InsertANewElementInArray.insertElements(myArray, elementToBeInserted);
        assertArrayEquals(result, new int[]{2, 8});
    }

    @Test
    public void NoElements() {
        int[] myArray = {};
        int elementToBeInserted = 8;
        int[] result = InsertANewElementInArray.insertElements(myArray, elementToBeInserted);
        assertArrayEquals(result, new int[]{8});
    }

    @Test
    public void tenElements() {
        int[] myArray = {-100, -20, 2, 5, 7, 9, 11, 80, 100, 300};
        int elementToBeInserted = 55;
        int[] result = InsertANewElementInArray.insertElements(myArray, elementToBeInserted);
        assertArrayEquals(result, new int[]{-100, -20, 2, 5, 7, 9, 11, 55, 80, 100, 300});
    }
}
