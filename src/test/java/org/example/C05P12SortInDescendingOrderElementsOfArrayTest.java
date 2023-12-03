package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class C05P12SortInDescendingOrderElementsOfArrayTest {
    @Test
    public void ThreeElements() {
        int[] myArray = {1,4,9};
        int[] result = C05P12SortInDescendingOrderElementsOfArray.SortInDescendingOrder(myArray);
        assertArrayEquals(new int[]{9,4,1}, result);
    }
    @Test
    public void SixElements() {
        int[] myArray = {1,4,9,12,100,0};
        int[] result = C05P12SortInDescendingOrderElementsOfArray.SortInDescendingOrder(myArray);
        assertArrayEquals(new int[]{100,12,9,4,1,0}, result);
    }
    @Test
    public void TwoElements() {
        int[] myArray = {1,4};
        int[] result = C05P12SortInDescendingOrderElementsOfArray.SortInDescendingOrder(myArray);
        assertArrayEquals(new int[]{4,1}, result);
    }
    @Test
    public void TwoElementsReverseOrder() {
        int[] myArray = {4,1};
        int[] result = C05P12SortInDescendingOrderElementsOfArray.SortInDescendingOrder(myArray);
        assertArrayEquals(new int[]{4,1}, result);
    }
}
