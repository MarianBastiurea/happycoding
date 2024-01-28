package com.marianbastiurea.c03arrays.insert;

import com.marianbastiurea.c03arrays.insert.InsertElementAtPositionInArray;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class InsertElementAtPositionInArrayTest {
    @Test
    public void fourElements() {
        int[] myArray = {1, 8, 7, 10};
        int elementToBeInserted = 5;
        int positionToInsertNewElement = 1;
        int[] result = InsertElementAtPositionInArray.insertElementAtPosition(myArray, elementToBeInserted, positionToInsertNewElement);
        assertArrayEquals(new int[]{1, 5, 7, 8, 10}, result);
    }

    @Test
    public void oneElements() {
        int[] myArray = {1};
        int elementToBeInserted = 5;
        int positionToInsertNewElement = 1;
        int[] result = InsertElementAtPositionInArray.insertElementAtPosition(myArray, elementToBeInserted, positionToInsertNewElement);
        assertArrayEquals(new int[]{1, 5}, result);
    }

    @Test
    public void noElements() {
        int[] myArray = {};
        int elementToBeInserted = 5;
        int positionToInsertNewElement = 0;
        int[] result = InsertElementAtPositionInArray.insertElementAtPosition(myArray, elementToBeInserted, positionToInsertNewElement);
        assertArrayEquals(new int[]{5}, result);
    }
}
