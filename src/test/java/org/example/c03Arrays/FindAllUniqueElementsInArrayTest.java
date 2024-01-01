package org.example.c03Arrays;

import org.example.c03arrays.FindAllUniqueElementsInArray;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class FindAllUniqueElementsInArrayTest {
    @Test
    public void TwoUniqueElements() {
        int[] myArray={3,2,2,-5,0};
        int[] result = FindAllUniqueElementsInArray.uniqueElement(myArray);
        assertArrayEquals(result,new int[] {3,-5,0});
    }
    @Test
    public void NoUniqueElements() {
        int[] myArray={2,2,2,2,};
        int[] result = FindAllUniqueElementsInArray.uniqueElement(myArray);
        assertArrayEquals(result,new int[] {});
    }
}
