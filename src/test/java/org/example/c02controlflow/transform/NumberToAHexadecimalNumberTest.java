package org.example.c02controlflow.transform;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class NumberToAHexadecimalNumberTest {
    @Test
    public void Ten() {
        int Number = 10;
        String resultHexadecimal = "A";
        String result = NumberToAHexadecimalNumber.decimalToHexadecimal(Number);
        assertEquals(result, resultHexadecimal);
    }

    @Test
    public void Fifteen() {
        int Number = 15;
        String resultHexadecimal = "F";
        String result = NumberToAHexadecimalNumber.decimalToHexadecimal(Number);
        assertEquals(result, resultHexadecimal);
    }

    @Test
    public void twentyFiveFortyFive() {
        int Number = 2545;
        String resultHexadecimal = "9F1";
        String result = NumberToAHexadecimalNumber.decimalToHexadecimal(Number);
        assertEquals(result, resultHexadecimal);
    }
}