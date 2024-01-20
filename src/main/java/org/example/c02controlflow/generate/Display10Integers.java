package org.example.c02controlflow.generate;

/*
 Write a program in Java to display the first 10 natural numbers.
 */
public class Display10Integers {
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