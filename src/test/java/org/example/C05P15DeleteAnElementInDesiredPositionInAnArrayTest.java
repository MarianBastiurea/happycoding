package org.example;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class C05P15DeleteAnElementInDesiredPositionInAnArrayTest {
    @Test
    public  void FiveElements() {
        int[] myArray = {1, 2, 3, 4, 5};
        int elementToBeDeleted = 3;
        int positionToDeleteAnElement = 2;
        int[] result = C05P15DeleteAnElementInDesiredPositionInAnArray.DeleteAnElement(myArray, elementToBeDeleted, positionToDeleteAnElement);
        assertArrayEquals(result, new int[]{1, 2, 4, 5});
    }

        @Test
        public  void OneElements(){
            int[] myArray={1};
            int elementToBeDeleted=1;
            int positionToDeleteAnElement=0;
            int[] result=C05P15DeleteAnElementInDesiredPositionInAnArray.DeleteAnElement(myArray,elementToBeDeleted,positionToDeleteAnElement);
            assertArrayEquals(result,new int[] {});
    }
}
