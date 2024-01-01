package org.example.c03Arrays;

import org.example.c03arrays.SortInAscendingOrderElementsOfArray;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class SortInAscendingOrderElementsOfArrayTest {
    @Test
    public void FiveElements() {
        int[] myArray = {2, 7, 4, 5, 9};
        int[] result = SortInAscendingOrderElementsOfArray.SortInAscendingOrder(myArray);
        assertArrayEquals(new int[]{2, 4, 5, 7, 9}, result);
    }

    @Test
    public void TenElements() {
        int[] myArray = {2, 7, 4, 5, 9, -10, -23, 9, 100, 1209};
        int[] result = SortInAscendingOrderElementsOfArray.SortInAscendingOrder(myArray);
        assertArrayEquals(new int[]{-23, -10, 2, 4, 5, 7, 9, 9, 100, 1209}, result);
    }
}