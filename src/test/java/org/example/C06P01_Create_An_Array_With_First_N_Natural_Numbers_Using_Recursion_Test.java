package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class C06P01_Create_An_Array_With_First_N_Natural_Numbers_Using_Recursion_Test {
    @Test
    public void First5Elements(){
        int start=0;
        int numberOfElements=5;
        int [] resultArray={1,2,3,4,5};
        int[] result= C06P01_Create_An_Array_With_First_N_Natural_Numbers_Using_Recursion.CreateAnArray(start,numberOfElements);
        assertArrayEquals(result, resultArray);
    }
    @Test
    public void First10Elements(){
        int start=0;
        int numberOfElements=10;
        int [] resultArray={1,2,3,4,5,6,7,8,9,10};
        int[] result= C06P01_Create_An_Array_With_First_N_Natural_Numbers_Using_Recursion.CreateAnArray(start,numberOfElements);
        assertArrayEquals(result, resultArray);
    }
}
