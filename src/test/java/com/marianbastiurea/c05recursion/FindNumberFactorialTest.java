package com.marianbastiurea.c05recursion;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FindNumberFactorialTest {
    @Test
    void given5AsNumberShouldReturn120() {
        int number = 5;
        int numberFactorial = 120;
        int result = FindFactorialOfANumber.factorialNumbers(number);
        assertEquals(numberFactorial, result);
    }
}
