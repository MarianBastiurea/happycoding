package org.example.c01declarationsandexpressions;

import java.util.Scanner;
/*
Write a program in Java to display a pattern like a diamond.

    *
   ***
  *****
 *******
*********
 *******
  *****
   ***
    *

 */

public class DisplaysAPatternLikeADiamondUsingAsterisk {
    public static void main(String[] args) {
        int rows;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of asterisk at diagonal: ");
        int numberOfRows = sc.nextInt();
        rows = numberOfRows - 1;
        for (int i = 1; i <= numberOfRows; ++i) {
            for (int j = rows; j > 0; --j) {
                System.out.print(" ");
            }
            rows = rows - 1;
            for (int k = 1; k <= i; ++k) {
                System.out.print(" * ");
            }
            System.out.println();
        }
        String b = " ";
        int t = 1;
        int x = numberOfRows - 1;
        for (int m = numberOfRows + t; m <= (2 * numberOfRows - 1); ++m) {
            System.out.print(b.repeat(t));
            t = t + 1;
            for (int p = x; p > 0; --p) {
                System.out.print(" * ");
            }
            x = x - 1;
            System.out.println();
        }
    }
}


