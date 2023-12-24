package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Convert_Decimal_Number_To_Octal_Number_Test {
    @Test
    public void Eigth() {
        int Number = 8;
        String resultOctal = "10";
        String result = Convert_Decimal_Number_To_Octal_Number.DecimalToOctal(Number);
        assertEquals(result, resultOctal);
    }
    @Test
    public void Nineteen() {
        int Number = 19;
        String resultOctal = "23";
        String result = Convert_Decimal_Number_To_Octal_Number.DecimalToOctal(Number);
        assertEquals(result, resultOctal);
    }
    @Test
    public void EigtyOne() {
        int Number = 81;
        String resultOctal = "121";
        String result = Convert_Decimal_Number_To_Octal_Number.DecimalToOctal(Number);
        assertEquals(result, resultOctal);
    }
}
