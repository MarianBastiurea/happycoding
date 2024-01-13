package org.example.c03arrays.delete;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class DeleteElementAtPositionInArrayTest {
    @Test
    public void fiveElements() {
        int[] myArray = {1, 2, 3, 4, 5};
        int positionToDeleteAnElement = 2;
        int[] result = DeleteElementAtPositionInArray.deleteElementAtPosition(myArray, positionToDeleteAnElement);
        assertArrayEquals(result, new int[]{1, 2, 4, 5});
    }

    @Test
    public void oneElements() {
        int[] myArray = {1};
        int positionToDeleteAnElement = 0;
        int[] result = DeleteElementAtPositionInArray.deleteElementAtPosition(myArray, positionToDeleteAnElement);
        assertArrayEquals(result, new int[]{});
    }
}