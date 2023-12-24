package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Find_Position_Of_A_Target_Value_Within_Sorted_Array_Using_Binary_Search_Test {
    @Test
    public void TenElements() {
        int[] myArray = {-100, -20, 0, 1, 2, 21, 45, 78, 87, 100};
        int Target = 2;
        int resultPosition = 4;
        int result = Find_Position_Of_A_Target_Value_Within_Sorted_Array_Using_Binary_Search.FindPosition(myArray, Target);
        assertEquals(resultPosition, result);
    }

}
