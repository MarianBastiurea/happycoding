package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class C05P44_Find_Two_Repeating_Elements_In_An_Array_Test {
    @Test
    public void SevenElements() {
        int[] myArray = {2, 7, 4, 7, 8, 3, 4};
        int[] resultArray = {7, 4};
        int[] result = C05P44_Find_Two_Repeating_Elements_In_An_Array.FindTwo(myArray);
        assertArrayEquals(resultArray, result);
    }

    @Test
    public void SixElements() {
        int[] myArray = {2, 7, 2, 7, 3, 3};
        int[] resultArray = {2, 7};
        int[] result = C05P44_Find_Two_Repeating_Elements_In_An_Array.FindTwo(myArray);
        assertArrayEquals(resultArray, result);
    }

}
