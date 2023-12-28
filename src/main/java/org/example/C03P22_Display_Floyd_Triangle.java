package org.example;

import java.util.Scanner;

/* Write a program in Java to print Floyd's Triangle.

1
01
101
0101
10101

https://www.w3resource.com/c-programming-exercises/for-loop/c-for-loop-exercises-22.php
 */

public class C03P22_Display_Floyd_Triangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of rows: ");
        int numberOfRows = sc.nextInt();
        for (int i = 1; i <= numberOfRows; ++i) {
            if (i % 2 == 0) {
                for (int j = 1; j <= i; ++j) {
                    if (j % 2 == 0) {
                        System.out.print("1 ");
                    } else {
                        System.out.print("0 ");
                    }
                }
            } else {
                for (int j = 1; j <= i; ++j) {
                    if (j % 2 == 0) {
                        System.out.print("0 ");
                    } else {
                        System.out.print("1 ");
                    }
                }
            }
            System.out.println();
        }
    }
}