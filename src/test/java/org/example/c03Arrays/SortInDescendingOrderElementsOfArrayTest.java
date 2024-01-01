package org.example.c03Arrays;

import org.example.c03arrays.SortInDescendingOrderElementsOfArray;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class SortInDescendingOrderElementsOfArrayTest {
    @Test
    public void ThreeElements() {
        int[] myArray = {1, 4, 9};
        int[] result = SortInDescendingOrderElementsOfArray.SortInDescendingOrder(myArray);
        assertArrayEquals(new int[]{9, 4, 1}, result);
    }

    @Test
    public void SixElements() {
        int[] myArray = {1, 4, 9, 12, 100, 0};
        int[] result = SortInDescendingOrderElementsOfArray.SortInDescendingOrder(myArray);
        assertArrayEquals(new int[]{100, 12, 9, 4, 1, 0}, result);
    }

    @Test
    public void TwoElements() {
        int[] myArray = {1, 4};
        int[] result = SortInDescendingOrderElementsOfArray.SortInDescendingOrder(myArray);
        assertArrayEquals(new int[]{4, 1}, result);
    }

    @Test
    public void TwoElementsReverseOrder() {
        int[] myArray = {4, 1};
        int[] result = SortInDescendingOrderElementsOfArray.SortInDescendingOrder(myArray);
        assertArrayEquals(new int[]{4, 1}, result);
    }
}
