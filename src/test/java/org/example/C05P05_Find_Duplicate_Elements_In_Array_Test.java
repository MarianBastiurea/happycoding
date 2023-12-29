package org.example;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class C05P05_Find_Duplicate_Elements_In_Array_Test {
    @Test
    public void noDuplicatesElements(){
        int[] myArray={1,2,3,4,5};
        int numberOfDuplicates=0;
        int result=C05P05_Find_Duplicate_Elements_In_Array.FindDuplicate(myArray);
        assertEquals(numberOfDuplicates,result);
    }
    @Test
    public void OneDuplicatesElements(){
        int[] myArray={1,2,3,4,5,1};
        int numberOfDuplicates=1;
        int result=C05P05_Find_Duplicate_Elements_In_Array.FindDuplicate(myArray);
        assertEquals(numberOfDuplicates,result);
    }
    @Test
    public void AllDuplicatesElements(){
        int[] myArray={1,1,1,1};
        int numberOfDuplicates=4;
        int result=C05P05_Find_Duplicate_Elements_In_Array.FindDuplicate(myArray);
        assertEquals(numberOfDuplicates,result);
    }
    @Test
    public void threeDuplicatesElements(){
        int[] myArray={1,1,1,6,8,9};
        int numberOfDuplicates=3;
        int result=C05P05_Find_Duplicate_Elements_In_Array.FindDuplicate(myArray);
        assertEquals(numberOfDuplicates,result);
    }
}
