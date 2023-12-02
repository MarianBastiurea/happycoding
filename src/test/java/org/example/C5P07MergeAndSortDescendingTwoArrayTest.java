package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class C5P07MergeAndSortDescendingTwoArrayTest {
    @Test
    public void MergeAndSortTwoArray() {
        C5P07MergeAndSortDescendingTwoArray obj= new C5P07MergeAndSortDescendingTwoArray();
        int [] FirstArray= new int [3];
        int [] SecondArray = new int[3];
        FirstArray[0]=1;
        FirstArray[1]=2;
        FirstArray[2]=3;
        SecondArray[0]=1;
        SecondArray[1]=2;
        SecondArray[2]=3;
        int[] result =obj.MergeAndSort(FirstArray,SecondArray);
        assertArrayEquals(result, new int[] {3,3,2,2,1,1});
    }
}
