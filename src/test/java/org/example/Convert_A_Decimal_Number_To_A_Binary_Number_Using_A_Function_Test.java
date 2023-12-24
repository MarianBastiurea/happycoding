package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Convert_A_Decimal_Number_To_A_Binary_Number_Using_A_Function_Test {
    @Test
    public void FortySeven() {
        int Number = 47;
        int resultNumber = 101111;
        int result = Convert_A_Decimal_Number_To_A_Binary_Number_Using_A_Function.ConvertDecimalToBinary(Number);
        assertEquals(result, resultNumber);
    }
    @Test
    public void Ten() {
        int Number = 10;
        int resultNumber = 1010;
        int result = Convert_A_Decimal_Number_To_A_Binary_Number_Using_A_Function.ConvertDecimalToBinary(Number);
        assertEquals(result, resultNumber);
    }
    @Test
    public void TwentyOne() {
        int Number = 21;
        int resultNumber = 10101;
        int result = Convert_A_Decimal_Number_To_A_Binary_Number_Using_A_Function.ConvertDecimalToBinary(Number);
        assertEquals(result, resultNumber);
    }
}
