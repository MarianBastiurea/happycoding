package org.example.c02controlflow.generate;

import java.util.Scanner;

/*
Write a Java program to make such a pattern as a pyramid with an asterisk.

   *
  * *
 * * *
* * * *

 */

public class PatternLikePyramidUsingAsterisk {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of Rows: ");
        int numberOfRows = sc.nextInt();
        int indentation = numberOfRows - 1;
        for (int i = 1; i <= numberOfRows; i++) {
            for (int j = indentation; j > 0; j--) {
                System.out.print(" ");
            }
            indentation = indentation - 1;
            for (int k = 1; k <= i; k++) {
                System.out.print(" *");
            }
            System.out.println();
        }
    }
}
