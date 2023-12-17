package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class C06P02_Sum_Numbers_From_1_To_N_Using_Recursion_Test {
    @Test
    public void SumOfFirst5Number(){
        // start=1 is the first number to sum
        // NumbersToAdd is first 5 natural numbers starting with 1
        int start=1;
        int NumbersToAdd=5;
        int resultSum=15;
        int result=C06P02_Sum_Numbers_From_1_To_N_Using_Recursion.SumFirstNNaturalNumbers(start,NumbersToAdd);
        assertEquals(result,resultSum);
    }
    @Test
    public void SumOfNumberFrom5To10(){
        // start=5 is the first number to sum
        // NumbersToAdd is first 5 natural numbers starting with 5
        int start=5;
        int NumbersToAdd=10;
        int resultSum=45;
        int result=C06P02_Sum_Numbers_From_1_To_N_Using_Recursion.SumFirstNNaturalNumbers(start,NumbersToAdd);
        assertEquals(result,resultSum);
    }
}
