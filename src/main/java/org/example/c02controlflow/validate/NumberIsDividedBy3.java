package org.example.c02controlflow.validate;

import java.util.Scanner;

/*
Write a Java program that checks if a given non-negative number is a multiple of 3 or 7, but not both
*/
public class NumberIsDividedBy3 {

    public static boolean findNumber(int number) {
        boolean result = false;
        if (number % 3 == 0) {
            result = true;
        }
        return result;
    }
}