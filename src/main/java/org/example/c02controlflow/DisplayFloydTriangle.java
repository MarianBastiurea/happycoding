package org.example.c02controlflow;

import java.util.Scanner;

/*
Write a program in Java to print Floyd's Triangle.

1
01
101
0101
10101

 */

public class DisplayFloydTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int numberOfRows = sc.nextInt();
        for (int i = 1; i <= numberOfRows; i++) {
            if (i % 2 == 0) {
                for (int j = 1; j <= i; j++) {
                    if (j % 2 == 0) {
                        System.out.print("1 ");
                    } else {
                        System.out.print("0 ");
                    }
                }
            } else {
                for (int j = 1; j <= i; j++) {
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