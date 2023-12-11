package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertTrue;
public class C05_P30_Check_If_Two_Matrix_Are_Equals_Test {
    @Test
    public void Three_Element_Matrix(){
        int[][] FirstMatrix={{1,2,3},{4,5,6},{7,8,9}};
        int[][] SecondMatrix={{1,2,3},{4,5,6},{7,8,9}};
        boolean result= C05P30_Check_If_Two_Matrix_Are_Equals.Check_Two_Matrix(FirstMatrix,SecondMatrix);
        assertTrue(result);
    }
}
