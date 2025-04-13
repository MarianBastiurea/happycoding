package com.marianbastiurea.c02controlflow.transform;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

 class DecimalToOctalNumberTest {
    @Test
     void octalNumberOnlyContainsNumbersFrom0To7() {
        int number = 10;
        String resultOctal = "12";
        String result = DecimalToOctalNumber.decimalToOctal(number);
        assertEquals(result, resultOctal);
    }
}
