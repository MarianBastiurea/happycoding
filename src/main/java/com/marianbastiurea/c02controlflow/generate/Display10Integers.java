package com.marianbastiurea.c02controlflow.generate;

/*
 Write a program in Java to display the first n natural numbers.
Fix the implementation to display n natural numbers instead of number + 10.
 */
public class Display10Integers {
    private Display10Integers () {}

    public static int[] find10Integer(int number) {
        // Display 10 integer starting with number given by test class
        int[] result = new int[10];
        int k = 0;
        for (int i = number; i < number + 10; i++) {
            result[k] = i;
            k++;
        }
        return result;
    }
}