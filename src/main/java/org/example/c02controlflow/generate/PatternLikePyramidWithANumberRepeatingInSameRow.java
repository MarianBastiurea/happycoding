package org.example.c02controlflow.generate;

import java.util.Scanner;

/*
Write a Java program to make such a pattern like a pyramid with a
number which will repeat the number in the same row.

   1
  2 2
 3 3 3
4 4 4 4

 */
public class PatternLikePyramidWithANumberRepeatingInSameRow {
    public static void main(String[] args) {
        int indentation;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter integer: ");
        int numberOfRows = sc.nextInt();
        indentation = numberOfRows - 1;
        for (int i = 1; i <= numberOfRows; i++) {
            for (int j = indentation; j > 0; j--) {
                System.out.print(" ");
            }
            indentation = indentation - 1;
            for (int k = 1; k <= i; k++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
}