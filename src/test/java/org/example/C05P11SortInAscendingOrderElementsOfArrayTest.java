package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import  java.util.Scanner;

public class C05P11SortInAscendingOrderElementsOfArrayTest {
    @Test
    public void FiveElements() {
        C05P11SortInAscendingOrderElementsOfArray obj = new C05P11SortInAscendingOrderElementsOfArray();
        int[] myArray = new int[5];
        myArray[0] = 2;
        myArray[1] = 7;
        myArray[2] = 4;
        myArray[3] = 5;
        myArray[4] = 9;
        int[] result = obj.SortInAscendingOrder(myArray);
        assertArrayEquals(result, new int[]{2, 4, 5, 7, 9});
    }
}