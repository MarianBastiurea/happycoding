package org.example.c02controlflow;

import org.example.c02controlflow.convertADecimalToBinaryNumber;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class convertADecimalToABinaryNumberTest {
    @Test
    public void FortySeven() {
        int Number = 47;
        int resultNumber = 101111;
        int result = convertADecimalToBinaryNumber.ConvertDecimalToBinary(Number);
        assertEquals(result, resultNumber);
    }

    @Test
    public void Ten() {
        int Number = 10;
        int resultNumber = 1010;
        int result = convertADecimalToBinaryNumber.ConvertDecimalToBinary(Number);
        assertEquals(result, resultNumber);
    }

    @Test
    public void TwentyOne() {
        int Number = 21;
        int resultNumber = 10101;
        int result = convertADecimalToBinaryNumber.ConvertDecimalToBinary(Number);
        assertEquals(result, resultNumber);
    }
}
