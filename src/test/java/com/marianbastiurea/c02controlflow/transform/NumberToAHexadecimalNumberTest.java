package com.marianbastiurea.c02controlflow.transform;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

 class NumberToAHexadecimalNumberTest {
    @Test
    void hexadecimalNumberHasNumberBetween0to9AndCharactersBetweenAAndF() {
        int number = 10;
        String resultHexadecimal = "A";
        String result = NumberToAHexadecimalNumber.decimalToHexadecimal(number);
        assertEquals(result, resultHexadecimal);
    }
}
