package com.marianbastiurea.c03arrays.insert;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

 class InsertElementInArrayTest {
    @Test
     void fiveElements() {
        int[] myArray = {2, 5, 7, 9, 11};
        int elementToBeInserted = 8;
        int[] result = InsertElementInArray.insertElements(myArray, elementToBeInserted);
        assertArrayEquals(new int[]{2, 5, 7, 8, 9, 11}, result);
    }

    @Test
    void oneElements() {
        int[] myArray = {2};
        int elementToBeInserted = 8;
        int[] result = InsertElementInArray.insertElements(myArray, elementToBeInserted);
        assertArrayEquals(new int[]{2, 8}, result);
    }

    @Test
     void NoElements() {
        int[] myArray = {};
        int elementToBeInserted = 8;
        int[] result = InsertElementInArray.insertElements(myArray, elementToBeInserted);
        assertArrayEquals(new int[]{8}, result);
    }

    @Test
    void tenElements() {
        int[] myArray = {-100, -20, 2, 5, 7, 9, 11, 80, 100, 300};
        int elementToBeInserted = 55;
        int[] result = InsertElementInArray.insertElements(myArray, elementToBeInserted);
        assertArrayEquals(new int[]{-100, -20, 2, 5, 7, 9, 11, 55, 80, 100, 300}, result);
    }
}
