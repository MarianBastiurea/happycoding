package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class C06P02_Sum_Numbers_From_1_To_N_Using_Recursion_Test {
    @Test
    public void SumOfFirst5Number(){
        int start=1;
        int NumbersToAdd=5;
        int resultSum=15;
        int result=C06P02_Sum_Numbers_From_1_To_N_Using_Recursion.SumFirstNNaturalNumbers(start,NumbersToAdd);
        assertEquals(result,resultSum);
    }
    @Test
    public void SumOfFirst10Number(){
        int start=1;
        int NumbersToAdd=10;
        int resultSum=55;
        int result=C06P02_Sum_Numbers_From_1_To_N_Using_Recursion.SumFirstNNaturalNumbers(start,NumbersToAdd);
        assertEquals(result,resultSum);
    }
}
