package com.marianbastiurea.c03arrays.delete;

import com.marianbastiurea.c03arrays.delete.DeleteElementAtPositionInArray;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class DeleteElementAtPositionInArrayTest {
    @Test
    public void givenPosition2ForDeleting3ShouldDisappeared() {
        int[] myArray = {1, 2, 3, 4, 5};
        int positionToDeleteAnElement = 2;
        int[] result = DeleteElementAtPositionInArray.deleteElementAtPosition(myArray, positionToDeleteAnElement);
        assertArrayEquals(result, new int[]{1, 2, 4, 5});
    }

    @Test
    public void givenPositionToBeDeletedIs0() {
        int[] myArray = {1};
        int positionToDeleteAnElement = 0;
        int[] result = DeleteElementAtPositionInArray.deleteElementAtPosition(myArray, positionToDeleteAnElement);
        assertArrayEquals(result, new int[]{});
    }
}
