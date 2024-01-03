package org.example.c04recursion;

/*
Write a program in Java to find the Factorial of a number using recursion
 */
public class FindFactorialOfANumberUsingRecursion {
    public static int FactorialNNaturalNumbers(int number) {
        int Factorial = 1;
        int NumberToFactorial = 1;
        if (NumberToFactorial <= number) {
            Factorial = number * FactorialNNaturalNumbers(number - 1);
        }
        return Factorial;
    }
}
