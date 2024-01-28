package com.marianbastiurea.c02controlflow.validate;

/*
Write a Java program to check whether a number is a palindrome or not.
 */

public class NumberIsPalindrome {
    private NumberIsPalindrome () {}

    public static boolean checkNumber(int number) {
        int reverseNumber = 0;
        boolean result = false;
        int originalNumber = number;
        for (; number != 0; number = number / 10) {
            int remainder = number % 10;
            reverseNumber = reverseNumber * 10 + remainder;
        }
        if (originalNumber == reverseNumber) {
            result = true;
        }
        return result;
    }
}