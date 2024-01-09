package org.example.c02controlflow;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class convertDecimalNumberToOctalNumberTest {
    @Test
    public void eight() {
        int Number = 8;
        String resultOctal = "10";
        String result = ConvertDecimalToOctalNumber.decimalToOctal(Number);
        assertEquals(result, resultOctal);
    }

    @Test
    public void nineteen() {
        int Number = 19;
        String resultOctal = "23";
        String result = ConvertDecimalToOctalNumber.decimalToOctal(Number);
        assertEquals(result, resultOctal);
    }

    @Test
    public void eightyOne() {
        int Number = 81;
        String resultOctal = "121";
        String result = ConvertDecimalToOctalNumber.decimalToOctal(Number);
        assertEquals(result, resultOctal);
    }
}
