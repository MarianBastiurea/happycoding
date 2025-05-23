package com.marianbastiurea.c03arrays.filter;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

 class FindTwoRepeatingElementsInAnArrayTest {
    @Test
     void Given2RepeatingElementShouldReturnThem() {
        int[] myArray = {2, 7, 4, 7, 8, 3, 9, 4};
        int[] resultArray = {7, 4};
        int[] result = FindTwoRepeatingElementsInAnArray.findRepeatingElements(myArray);
        assertArrayEquals(resultArray, result);
    }

    @Test
    void givenDifferentElementsShouldReturnEmptyArray() {
        int[] myArray = {2, 7, 1, 0, 4, 13};
        int[] resultArray = {};
        int[] result = FindTwoRepeatingElementsInAnArray.findRepeatingElements(myArray);
        assertArrayEquals(resultArray, result);
    }

}
