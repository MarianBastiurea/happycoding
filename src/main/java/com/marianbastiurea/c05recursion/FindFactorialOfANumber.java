package com.marianbastiurea.c05recursion;

/*
Write a program in Java to find the Factorial of a number using recursion
 */
public class FindFactorialOfANumber {
    private FindFactorialOfANumber() {
    }

    public static int factorialNumbers(int number) {
        int factorial = 1;
        int numberToFactorial = 1;
        if (numberToFactorial <= number) {
            factorial = number * factorialNumbers(number - 1);
        }
        return factorial;
    }
}
