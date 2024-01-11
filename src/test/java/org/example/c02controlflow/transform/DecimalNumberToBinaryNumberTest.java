package org.example.c02controlflow.transform;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DecimalNumberToBinaryNumberTest {
    @Test
    public void fortySeven() {
        int number = 47;
        int resultNumber = 101111;
        int result = DecimalNumberToBinaryNumber.convertDecimalToBinary(number);
        assertEquals(result, resultNumber);
    }

    @Test
    public void ten() {
        int number = 10;
        int resultNumber = 1010;
        int result = DecimalNumberToBinaryNumber.convertDecimalToBinary(number);
        assertEquals(result, resultNumber);
    }

    @Test
    public void twentyOne() {
        int number = 21;
        int resultNumber = 10101;
        int result = DecimalNumberToBinaryNumber.convertDecimalToBinary(number);
        assertEquals(result, resultNumber);
    }
}
