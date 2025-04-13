package com.marianbastiurea.c03arrays.sort;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

 class BubbleSortReverseTest {
    @Test
     void givenAAscendingSortedArrayShouldReturnSameArrayDescendingSorted() {
        int[] myArray = {1, 4, 9};
        int[] result = BubbleSortReverse.sortInDescendingOrder(myArray);
        assertArrayEquals(new int[]{9, 4, 1}, result);
    }
}
