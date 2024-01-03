package org.example.c04recursion;

import org.example.c04recursion.FindFactorialOfANumberUsingRecursion;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FindFactorialOfANumberUsingRecursionTest {
    @Test
    public void First5Factorial() {
        int number = 5;
        int numberFactorial = 120;
        int result = FindFactorialOfANumberUsingRecursion.FactorialNNaturalNumbers(number);
        assertEquals(numberFactorial, result);
    }

    @Test
    public void First1Factorial() {
        int number = 1;
        int numberFactorial = 1;
        int result = FindFactorialOfANumberUsingRecursion.FactorialNNaturalNumbers(number);
        assertEquals(numberFactorial, result);
    }

}
