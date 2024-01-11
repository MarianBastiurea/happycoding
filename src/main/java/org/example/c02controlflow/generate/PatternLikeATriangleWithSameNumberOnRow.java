package org.example.c02controlflow.generate;

import java.util.Scanner;

/*
Write a program in Java to make such a pattern like a right angle triangle
with a number which will repeat a number in a row.

The pattern like :

 1
 22
 333
 4444

 */

public class PatternLikeATriangleWithSameNumberOnRow {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of rows: ");
        int numberOfRows = sc.nextInt();
        for (int i = 1; i <= numberOfRows; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
}