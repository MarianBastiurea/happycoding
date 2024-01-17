package org.example.c02controlflow.validate;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class NumberIsPalindromeTest {
    @Test
    public void When_NumberIs0_Expect_ToBeAPalindrome() {
        int number = 0;
        boolean result = NumberIsPalindrome.checkNumber(number);
        assertTrue(result);
    }

    @Test
    public void When_NumberIs12321_Expect_ToBeAPalindrome() {
        int number = 12321;
        boolean result = NumberIsPalindrome.checkNumber(number);
        assertTrue(result);
    }

    @Test
    public void When_NumberIs123_Expect_NotToBeAPalindrome() {
        int number = 123;
        boolean result = NumberIsPalindrome.checkNumber(number);
        assertFalse(result);
    }
}
