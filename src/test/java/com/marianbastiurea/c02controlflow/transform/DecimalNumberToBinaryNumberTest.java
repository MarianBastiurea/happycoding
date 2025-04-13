package com.marianbastiurea.c02controlflow.transform;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

 class DecimalNumberToBinaryNumberTest {
    @Test
     void decimalNumberCanOnlyHave0And1() {
        int number = 47;
        int resultNumber = 101111;
        int result = DecimalNumberToBinaryNumber.convertDecimalToBinary(number);
        assertEquals(result, resultNumber);
    }
}
