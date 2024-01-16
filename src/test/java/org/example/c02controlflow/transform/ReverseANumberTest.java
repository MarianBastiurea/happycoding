package org.example.c02controlflow.transform;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ReverseANumberTest {
    @Test
    public void firstTest() {
        int number = 123;
        int reverseNumber = 321;
        int result = ReverseANumber.reverse(number);
        assertEquals(result, reverseNumber);
    }

    @Test
    public void secondTest() {
        int number = 123456789;
        int reverseNumber = 987654321;
        int result = ReverseANumber.reverse(number);
        assertEquals(result, reverseNumber);
    }
}
