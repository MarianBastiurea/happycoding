package org.example.c02controlflow.generate;

import java.util.Scanner;

/*
Write a program in Java to display the multiplier table vertically from 1 to n.
 */
public class MultiplierTableFrom1ToNumber {
    public static int[] multiplyNumber(int number) {
        int[] result = new int[10 * number];
        int k = 0;
        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= number; ++j) {
                result[k] = i * j;
                k++;
            }
        }
        return result;
    }
}