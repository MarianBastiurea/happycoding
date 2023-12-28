package org.example;

import java.util.Scanner;

/* Write a C program to display a such a pattern for n rows using a number that starts with 1 and each row will have a 1 as the first and last number.

  1
 121
12321

https://www.w3resource.com/c-programming-exercises/for-loop/c-for-loop-exercises-36.php
 */

public class C03P36_Displays_A_Pattern_Like_A_Pyramid_Where_First_And_Last_Number_Are_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int numberOfRows = sc.nextInt();
        for (int i = 1; i <= numberOfRows; ++i) {
            for (int j = 0; j <= numberOfRows - i; ++j) {
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