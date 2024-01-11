package org.example.c03arrays.filter;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class FindTwoRepeatingElementsInAnArrayTest {
    @Test
    public void sevenElements() {
        int[] myArray = {2, 7, 4, 7, 8, 3, 4};
        int[] resultArray = {7, 4};
        int[] result = FindTwoRepeatingElementsInAnArray.findRepeatingElements(myArray);
        assertArrayEquals(resultArray, result);
    }

    @Test
    public void sixElements() {
        int[] myArray = {2, 7, 2, 7, 3, 3};
        int[] resultArray = {2, 7};
        int[] result = FindTwoRepeatingElementsInAnArray.findRepeatingElements(myArray);
        assertArrayEquals(resultArray, result);
    }

}
