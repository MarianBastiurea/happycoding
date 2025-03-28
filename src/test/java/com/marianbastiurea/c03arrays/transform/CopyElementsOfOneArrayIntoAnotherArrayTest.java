package com.marianbastiurea.c03arrays.transform;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class CopyElementsOfOneArrayIntoAnotherArrayTest {
    @Test
    public void copyAnEmptyArray() {
        int[] myArray = {};
        int[] result = CopyElementsOfOneArrayIntoAnotherArray.copyElements(myArray);
        assertArrayEquals(result, myArray);
    }

    @Test
    public void copyOneElementArray() {
        int[] myArray = {1};
        int[] result = CopyElementsOfOneArrayIntoAnotherArray.copyElements(myArray);
        assertArrayEquals(result, myArray);
    }
}
