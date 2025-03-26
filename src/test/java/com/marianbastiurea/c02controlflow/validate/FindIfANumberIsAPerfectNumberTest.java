package com.marianbastiurea.c02controlflow.validate;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class FindIfANumberIsAPerfectNumberTest {
    @Test
    public void sixIsAPerfectNumber() {
        int number = 6;
        boolean result = FindIfANumberIsAPerfectNumber.findPerfectNumber(number);
        assertTrue(result);
    }

    @Test
    public void nineIsNotAPerfectNumber() {
        int number = 9;
        boolean result = FindIfANumberIsAPerfectNumber.findPerfectNumber(number);
        assertFalse(result);
    }
}
