package org.example.c05recursion;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FindNumberFactorialTest {
    @Test
    public void first5Factorial() {
        int number = 5;
        int numberFactorial = 120;
        int result = FindFactorialOfANumber.FactorialNumbers(number);
        assertEquals(numberFactorial, result);
    }

    @Test
    public void first1Factorial() {
        int number = 1;
        int numberFactorial = 1;
        int result = FindFactorialOfANumber.FactorialNumbers(number);
        assertEquals(numberFactorial, result);
    }

}
