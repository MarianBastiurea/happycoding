package org.example.c02controlflow.validate;

/*
Write a Java program that checks if a positive integer is divisible by either 3 or 7,
or both. If the integer is a multiple of 3, then the program will return true.
 Similarly, if the integer is a multiple of 7, then also the program will return true.
 If the integer is not a multiple of 3 or 7, then the program will return false.
*/

public class FindIfANumberIsDividedBy3or7 {
    private FindIfANumberIsDividedBy3or7 () {}

    public static boolean findNumber(int number) {
        boolean result = false;
        if (number % 3 == 0 || number % 7 == 0) {
            result = true;
        }
        return result;
    }
}