package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class C05P12SortInDescendingOrderElementsOfArrayTest {
    @Test
    public void ThreeElements() {
        C05P12SortInDescendingOrderElementsOfArray obj = new C05P12SortInDescendingOrderElementsOfArray();
        int[] myArray = new int[3];
        myArray[0] = 5;
        myArray[1] = 9;
        myArray[2] = 1;
        int[] result = obj.SortInDescendingOrder(myArray);
        assertArrayEquals(result, new int[] {9,5,1});
    }
}
