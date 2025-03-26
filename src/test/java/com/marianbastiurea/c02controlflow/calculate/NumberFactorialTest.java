package com.marianbastiurea.c02controlflow.calculate;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class NumberFactorialTest {
    @Test
    public void five() {
        int number = 5;
        int factorial = 120;
        int result = NumberFactorial.findFactorial(number);
        assertEquals(result, factorial);
    }

    @Test
    public void one() {
        int number = 1;
        int factorial = 1;
        int result = NumberFactorial.findFactorial(number);
        assertEquals(result, factorial);
    }

    @Test
    public void zero() {
        int number = 0;
        int factorial = 1;// as a math convention, factorial of 0 is 1
        int result = NumberFactorial.findFactorial(number);
        assertEquals(result, factorial);
    }

    @Test
    public void negativeNumber() {
        int number = -10;
        int factorial = 0;// as a math convention, doesn't exist factorial for negative number,
        // just for positive number. I choose ) just for test purpose
        int result = NumberFactorial.findFactorial(number);
        assertEquals(result, factorial);
    }
}
