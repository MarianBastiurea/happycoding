package org.example.c03arrays.filter;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class FindAllUniqueElementsInArrayTest {
    @Test
    public void twoUniqueElements() {
        int[] myArray={3,2,2,-5,0};
        int[] result = FindAllUniqueElementsInArray.uniqueElement(myArray);
        assertArrayEquals(result,new int[] {3,-5,0});
    }
    @Test
    public void noUniqueElements() {
        int[] myArray={2,2,2,2,};
        int[] result = FindAllUniqueElementsInArray.uniqueElement(myArray);
        assertArrayEquals(result,new int[] {});
    }
}
