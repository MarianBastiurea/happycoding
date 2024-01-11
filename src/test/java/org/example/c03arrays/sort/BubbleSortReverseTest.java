package org.example.c03arrays.sort;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class BubbleSortReverseTest {
    @Test
    public void threeElements() {
        int[] myArray = {1, 4, 9};
        int[] result = BubbleSortReverse.sortInDescendingOrder(myArray);
        assertArrayEquals(new int[]{9, 4, 1}, result);
    }

    @Test
    public void sixElements() {
        int[] myArray = {1, 4, 9, 12, 100, 0};
        int[] result = BubbleSortReverse.sortInDescendingOrder(myArray);
        assertArrayEquals(new int[]{100, 12, 9, 4, 1, 0}, result);
    }

    @Test
    public void twoElements() {
        int[] myArray = {1, 4};
        int[] result = BubbleSortReverse.sortInDescendingOrder(myArray);
        assertArrayEquals(new int[]{4, 1}, result);
    }

    @Test
    public void TwoElementsReverseOrder() {
        int[] myArray = {4, 1};
        int[] result = BubbleSortReverse.sortInDescendingOrder(myArray);
        assertArrayEquals(new int[]{4, 1}, result);
    }
}
