package org.example.c02controlflow.validate;


/*
 Write a Java program to check whether a given number is a 'Perfect' number or not.
Perfect number is a positive number which sum of all positive divisors excluding
that number is equal to that number. For example, 6 is a perfect number since the
divisors of 6 are 1, 2, and 3. Sum of its divisors is 1 + 2 + 3 = 6

 */

public class FindIfANumberIsAPerfectNumber {
    private FindIfANumberIsAPerfectNumber () {}

    public static boolean findPerfectNumber(int number) {
        int sum = 0;
        boolean result = false;
        for (int i = 1; i < number; i++) {
            if (number % i == 0) {
                sum = sum + i;
            }
        }
        if (sum == number)
            result = true;
        return result;
    }
}