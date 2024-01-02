package org.example.c03Arrays;

import org.example.c03arrays.DeleteAnElementInDesiredPositionInAnArray;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class DeleteAnElementInDesiredPositionInAnArrayTest {
    @Test
    public void FiveElements() {
        int[] myArray = {1, 2, 3, 4, 5};
        int elementToBeDeleted = 3;
        int positionToDeleteAnElement = 2;
        int[] result = DeleteAnElementInDesiredPositionInAnArray.DeleteAnElement(myArray, elementToBeDeleted, positionToDeleteAnElement);
        assertArrayEquals(result, new int[]{1, 2, 4, 5});
    }

    @Test
    public void OneElements() {
        int[] myArray = {1};
        int elementToBeDeleted = 1;
        int positionToDeleteAnElement = 0;
        int[] result = DeleteAnElementInDesiredPositionInAnArray.DeleteAnElement(myArray, elementToBeDeleted, positionToDeleteAnElement);
        assertArrayEquals(result, new int[]{});
    }
}
