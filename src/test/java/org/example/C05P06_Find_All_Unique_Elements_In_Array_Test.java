package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class C05P06_Find_All_Unique_Elements_In_Array_Test {
    @Test
    public void TwoUniqueElements() {
        C05P06_Find_All_Unique_Elements_In_Array obj=new C05P06_Find_All_Unique_Elements_In_Array();
        int[] myArray={3,2,2,5};
        int[] result =obj.uniqueElement(myArray);
        assertArrayEquals(result,new int[] {3,5});
    }
    @Test
    public void NoUniqueElements() {
        C05P06_Find_All_Unique_Elements_In_Array obj=new C05P06_Find_All_Unique_Elements_In_Array();
        int[] myArray=new int[4];
        myArray[0]=;
        myArray[1]=2;
        myArray[2]=2;
        myArray[3]=5;
        int[] result =obj.uniqueElement(myArray);
        assertArrayEquals(result,new int[] {3,5});
    }
}
