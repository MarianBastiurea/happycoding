package com.marianbastiurea.c02controlflow.validate;

/*
Write a Java program that checks if a given non-negative number is a multiple of 3 or 7, but not both
*/
public class NumberIsDividedBy3 {
    private NumberIsDividedBy3() {
    }


    public static boolean findNumber(int number) {
        boolean result = false;
        if (number % 3 == 0)
            result = true;
        return result;
    }
}