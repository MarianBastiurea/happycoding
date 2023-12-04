package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import  java.util.Scanner;

public class C05P11SortInAscendingOrderElementsOfArrayTest {
    @Test
    public void FiveElements() {
        int[] myArray = {2,7,4,5,9};
        int[] result = C05P11SortInAscendingOrderElementsOfArray.SortInAscendingOrder(myArray);
        assertArrayEquals(new int[]{2, 4, 5, 7, 9},result);
    }
    @Test
    public void TenElements() {
        int[] myArray = {2,7,4,5,9,-10,-23,9,100,1209};
        int[] result = C05P11SortInAscendingOrderElementsOfArray.SortInAscendingOrder(myArray);
        assertArrayEquals(new int[]{-23,-10,2,4,5,7,9,9,100,1209},result);
    }
}