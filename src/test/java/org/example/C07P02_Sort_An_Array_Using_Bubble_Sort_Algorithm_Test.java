package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;
public class C07P02_Sort_An_Array_Using_Bubble_Sort_Algorithm_Test {
    @Test
    public void FiveElements(){
        int[] myArray={17,2,34,-1,222};
        int[] resultArray={222,34,17,2,-1};
        int[] result=C07P02_Sort_An_Array_Using_Bubble_Sort_Algorithm.SortArrayUsingBubbleSort(myArray);
        assertArrayEquals(result,resultArray);
    }
    @Test
    public void SixElements(){
        int[] myArray={17,2,34,-1,222,2};
        int[] resultArray={222,34,17,2,2,-1};
        int[] result=C07P02_Sort_An_Array_Using_Bubble_Sort_Algorithm.SortArrayUsingBubbleSort(myArray);
        assertArrayEquals(result,resultArray);
    }
}
