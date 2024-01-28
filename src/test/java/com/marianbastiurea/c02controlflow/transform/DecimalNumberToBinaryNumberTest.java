package com.marianbastiurea.c02controlflow.transform;

import com.marianbastiurea.c02controlflow.transform.DecimalNumberToBinaryNumber;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DecimalNumberToBinaryNumberTest {
    @Test
    public void decimalNumberCanOnlyHave0And1() {
        int number = 47;
        int resultNumber = 101111;
        int result = DecimalNumberToBinaryNumber.convertDecimalToBinary(number);
        assertEquals(result, resultNumber);
    }
}
