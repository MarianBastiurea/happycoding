package org.example.c02controlflow.validate;

/*
 Write a Java program to determine whether a given number is prime or not.
*/

public class NumberIsPrime {
    public static boolean checkNumber(int number) {
        int divisors = 1;// give divisors value 1 is for division by 1
        boolean result=true;
        for (int i = 2; i <= number; i++) {
            if (number % i == 0) {
                divisors++;
            }
        }
        if (divisors > 2)
            result=false;
        return result;
    }
}
