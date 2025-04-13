package com.marianbastiurea.c02controlflow.validate;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

 class NumberIsPalindromeTest {
    @Test
     void number0ExpectToBeAPalindrome() {
        int number = 0;
        boolean result = NumberIsPalindrome.checkNumber(number);
        assertTrue(result);
    }

    @Test
     void number12321ExpectToBeAPalindrome() {
        int number = 12321;
        boolean result = NumberIsPalindrome.checkNumber(number);
        assertTrue(result);
    }

    @Test
     void number123ExpectNotToBeAPalindrome() {
        int number = 123;
        boolean result = NumberIsPalindrome.checkNumber(number);
        assertFalse(result);
    }
}
