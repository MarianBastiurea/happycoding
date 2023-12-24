package org.example;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

public class C07P06_Sort_An_Array_Using_Quick_Sort_Algorithm_Test {
    @Test
    public void TenElements() {
        int[] myArray = {-2, 9, 0, -100, 90, 88, 0, 91, 100, 1};
        int[] resultArray = {-100, -2, 0, 0, 1, 9, 88, 90, 91, 100};
        int[] result = C07P06_Sort_An_Array_Using_Quick_Sort_Algorithm.QuickSort(myArray);
        assertArrayEquals(result, resultArray);
    }
}
