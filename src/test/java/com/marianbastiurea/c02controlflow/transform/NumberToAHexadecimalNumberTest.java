package com.marianbastiurea.c02controlflow.transform;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class NumberToAHexadecimalNumberTest {
    @Test
    public void hexadecimalNumberHasNumberBetween0to9AndCharactersBetweenAAndF() {
        int Number = 10;
        String resultHexadecimal = "A";
        String result = NumberToAHexadecimalNumber.decimalToHexadecimal(Number);
        assertEquals(result, resultHexadecimal);
    }
}
