package org.example.c03Arrays;

import org.example.c03arrays.InsertAnewElementInaPositionInArray;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class InsertAnewElementInaPositionInArrayTest {
    @Test
    public void FourElements() {
        int[] myArray = {1, 8, 7, 10};
        int elementToBeInserted = 5;
        int positionToInsertNewElement = 1;
        int[] result = InsertAnewElementInaPositionInArray.InsertElement(myArray, elementToBeInserted, positionToInsertNewElement);
        assertArrayEquals(new int[]{1, 5, 7, 8, 10}, result);
    }

    @Test
    public void OneElements() {
        int[] myArray = {1};
        int elementToBeInserted = 5;
        int positionToInsertNewElement = 1;
        int[] result = InsertAnewElementInaPositionInArray.InsertElement(myArray, elementToBeInserted, positionToInsertNewElement);
        assertArrayEquals(new int[]{1, 5}, result);
    }

    @Test
    public void NoElements() {
        int[] myArray = {};
        int elementToBeInserted = 5;
        int positionToInsertNewElement = 0;
        int[] result = InsertAnewElementInaPositionInArray.InsertElement(myArray, elementToBeInserted, positionToInsertNewElement);
        assertArrayEquals(new int[]{5}, result);
    }
}
