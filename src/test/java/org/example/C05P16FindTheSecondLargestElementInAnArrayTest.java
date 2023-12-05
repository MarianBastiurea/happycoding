package org.example;

import org.junit.jupiter.api.Test;

import static org.example.C05P16FindTheSecondLargestElementInAnArray.*;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class C05P16FindTheSecondLargestElementInAnArrayTest {
    @Test
    public void FiveElements(){
        int[] myArray={2,9,1,4,6};
        int[] result=C05P16FindTheSecondLargestElementInAnArray.FindSecondLargestElementInArray(myArray);
        assertArrayEquals(result,new int[] {6});
    }
    @Test
    public void TwoElements(){
        int[] myArray={100,2};
        int[] result=C05P16FindTheSecondLargestElementInAnArray.FindSecondLargestElementInArray(myArray);
        assertArrayEquals(result,new int[] {2});
    }
    @Test
    public void ThreeElements(){
        int[] myArray={100,9,-2};
        int[] result=C05P16FindTheSecondLargestElementInAnArray.FindSecondLargestElementInArray(myArray);
        assertArrayEquals(result,new int[] {9});
    }
}
