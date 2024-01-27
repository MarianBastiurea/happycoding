package org.example.c02controlflow.calculate;



/*
 Write a Java program to calculate the factorial of a given number.
 */

public class NumberFactorial {
    private NumberFactorial () {}

    public static int findFactorial(int number) {
        int factorial = 1;
        if (number < 0) {
            factorial = 0;
        } else if (number == 0) {
            factorial = 1;
        } else {
            for (int i = 1; i <= number; i++) {
                factorial = factorial * i;
            }
        }
        return factorial;
    }
}