package org.example.c02controlflow;

import org.example.c02controlflow.convertDecimalToOctalNumber;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class convertDecimalNumberToOctalNumberTest {
    @Test
    public void Eight() {
        int Number = 8;
        String resultOctal = "10";
        String result = convertDecimalToOctalNumber.DecimalToOctal(Number);
        assertEquals(result, resultOctal);
    }

    @Test
    public void Nineteen() {
        int Number = 19;
        String resultOctal = "23";
        String result = convertDecimalToOctalNumber.DecimalToOctal(Number);
        assertEquals(result, resultOctal);
    }

    @Test
    public void EightyOne() {
        int Number = 81;
        String resultOctal = "121";
        String result = convertDecimalToOctalNumber.DecimalToOctal(Number);
        assertEquals(result, resultOctal);
    }
}
