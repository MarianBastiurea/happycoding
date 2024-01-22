package org.example.c02controlflow.generate;

/*
 Write a program in Java to display the first n terms of the Fibonacci series.
Fibonacci series 0 1 2 3 5 8 13
 */

public class NTermsOfFibonacciSeries {
    public static int[] storeElements(int number) {
        int[] result = new int[10];
        result[0] = 0;
        result[1] = 1;
        int x = 0;
        int y = 1;
        for (int i = 2; i < number; i++) {
            result[i] = x + y;
            x = y;
            y = result[i];
        }
        return result;
    }
}