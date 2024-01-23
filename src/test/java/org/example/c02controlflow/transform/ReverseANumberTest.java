package org.example.c02controlflow.transform;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ReverseANumberTest {
    @Test
    public void reverseNumberIsSameNumberWrittenFromEndToStart() {
        int number = 123;
        int reverseNumber = 321;
        int result = ReverseANumber.reverse(number);
        assertEquals(result, reverseNumber);
    }
}
