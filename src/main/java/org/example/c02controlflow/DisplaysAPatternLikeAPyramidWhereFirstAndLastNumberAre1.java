package org.example.c02controlflow;

import java.util.Scanner;

/*
Write a C program to display a such a pattern for n rows using a number that starts with 1 and each row will have a 1 as the first and last number.

  1
 121
12321

 */

public class DisplaysAPatternLikeAPyramidWhereFirstAndLastNumberAre1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int numberOfRows = sc.nextInt();
        for (int i = 1; i <= numberOfRows; i++) {
            for (int j = 0; j <= numberOfRows - i; j++) {
                System.out.print("  ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print(k + " ");
            }
            for (int l = i - 1; l >= 1; l--) {
                System.out.print(l + " ");
            }
            System.out.println();
        }
    }
}