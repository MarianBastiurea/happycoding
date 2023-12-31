package org.example.c02controlflow;

import java.util.Scanner;

/*
Write a Java program to make such a pattern like a pyramid with a
number which will repeat the number in the same row.

   1
  2 2
 3 3 3
4 4 4 4

 */
public class DisplayAPatternLikeAPyramidWithANumberRepeatingInSameRow {
    public static void main(String[] args) {
        int rows;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter integer: ");
        int numberOfRows = sc.nextInt();
        rows = numberOfRows - 1;
        for (int i = 1; i <= numberOfRows; ++i) {
            for (int j = rows; j > 0; --j) {
                System.out.print(" ");
            }
            rows = rows - 1;
            for (int k = 1; k <= i; ++k) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
}