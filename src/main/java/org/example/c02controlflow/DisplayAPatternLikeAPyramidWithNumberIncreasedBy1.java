package org.example.c02controlflow;

import java.util.Scanner;

/*
Write a program in Java to make a pyramid pattern with numbers increased by 1.

   1
  2 3
 4 5 6
7 8 9 10

 */

public class DisplayAPatternLikeAPyramidWithNumberIncreasedBy1 {
    public static void main(String[] args) {
        int count = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int numberOfRows = sc.nextInt();
        int rows = numberOfRows - 1;
        for (int i = 1; i <= numberOfRows; ++i) {
            for (int j = rows; j > 0; j--) {
                System.out.print(" ");
            }
            rows = rows - 1;
            for (int c = 1; c <= i; ++c) {
                count = count + 1;
                System.out.print(count + " ");
            }
            System.out.println();
        }
    }
}
