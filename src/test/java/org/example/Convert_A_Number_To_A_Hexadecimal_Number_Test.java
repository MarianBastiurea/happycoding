package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Convert_A_Number_To_A_Hexadecimal_Number_Test {
    @Test
    public void Ten() {
        int Number = 10;
        String resultHexadecimal = "A";
        String result = Convert_A_Number_To_A_Hexadecimal_Number.DecimalToHexadecimal(Number);
        assertEquals(result, resultHexadecimal);
    }

    @Test
    public void Fifteen() {
        int Number = 15;
        String resultHexadecimal = "F";
        String result = Convert_A_Number_To_A_Hexadecimal_Number.DecimalToHexadecimal(Number);
        assertEquals(result, resultHexadecimal);
    }

    @Test
    public void twentyFiveFortyFive() {
        int Number = 2545;
        String resultHexadecimal = "9F1";
        String result = Convert_A_Number_To_A_Hexadecimal_Number.DecimalToHexadecimal(Number);
        assertEquals(result, resultHexadecimal);
    }
}
