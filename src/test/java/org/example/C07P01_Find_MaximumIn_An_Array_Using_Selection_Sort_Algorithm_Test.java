package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
public class C07P01_Find_MaximumIn_An_Array_Using_Selection_Sort_Algorithm_Test {

    @Test
    public void FiveMaxElements(){
        //have to find maximum of elements and
       int[] myArray={14,45,67,2,1};
       int maximum= 67;
       int result= C07P01_Find_Maximum_In_An_Array_Using_Selection_Sort_Algorithm.FindMaximumInArray(myArray);
       assertEquals(maximum,result);
    }
    @Test
    public void FiveMaxElementsWithNegativeNumber(){
        //have to find maximum of elements and
        // sort ascending
        int[] myArray={14,45,-67,-2,1};
        int maximum=45;
        int result= C07P01_Find_Maximum_In_An_Array_Using_Selection_Sort_Algorithm.FindMaximumInArray(myArray);
        assertEquals(maximum,result);
    }
}
