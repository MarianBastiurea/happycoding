package org.example.c02controlflow.transform;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DecimalToOctalNumberTest {
    @Test
    public void octalNumberOnlyContainsNumbersFrom0To7() {
        int Number = 10;
        String resultOctal = "12";
        String result = DecimalToOctalNumber.decimalToOctal(Number);
        assertEquals(result, resultOctal);
    }
}
