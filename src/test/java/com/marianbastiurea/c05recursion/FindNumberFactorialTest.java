package com.marianbastiurea.c05recursion;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FindNumberFactorialTest {
    @Test
    public void given5AsNumberShouldReturn120() {
        int number = 5;
        int numberFactorial = 120;
        int result = FindFactorialOfANumber.FactorialNumbers(number);
        assertEquals(numberFactorial, result);
    }
}
