package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;
public class C07P03_Sort_An_Array_Using_The_Insertion_Sort_Algorithm_Test {
    @Test
    public void TenElements(){
        int[] myArray={2,1,-100,23,4,33,-9,0,100,44,4};
        int[] resultArray={-100,-9,0,1,2,4,4,23,33,44,100};
        int[] result=C07P03_Sort_An_Array_Using_The_Insertion_Sort_Algorithm.SortUsingInsertion(myArray);
        assertArrayEquals(result,resultArray);
    }
}
