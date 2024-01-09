package org.example.c04recursion;

/*
Write a program in Java to find the Factorial of a number using recursion
 */
public class FindFactorialOfANumber {
    public static int FactorialNumbers(int number) {
        int Factorial = 1;
        int NumberToFactorial = 1;
        if (NumberToFactorial <= number) {
            Factorial = number * FactorialNumbers(number - 1);
        }
        return Factorial;
    }
}
