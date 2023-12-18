package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;
public class C07_P01_Swap_Between_Max_And_First_Element_In_Array_Using_Sort_Algorithm_Test {
    @Test
    public void FiveElement() {
        int[] myArray = {10, 25, 44, 33, 1};
        int[] resultArray = {44, 25, 10, 33, 1};
        int[] result = C07_P01_Swap_Between_Max_And_First_Element_In_Array_Using_Sort_Algorithm.SwapBetweenMax(myArray);
        assertArrayEquals(result, resultArray);
    }

}
