package com.marianbastiurea.c03arrays.transform;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

 class CopyElementsOfOneArrayIntoAnotherArrayTest {
    @Test
     void copyAnEmptyArray() {
        int[] myArray = {};
        int[] result = CopyElementsOfOneArrayIntoAnotherArray.copyElements(myArray);
        assertArrayEquals(myArray, result);
    }

    @Test
    void copyOneElementArray() {
        int[] myArray = {1};
        int[] result = CopyElementsOfOneArrayIntoAnotherArray.copyElements(myArray);
        assertArrayEquals(myArray, result);
    }
}
