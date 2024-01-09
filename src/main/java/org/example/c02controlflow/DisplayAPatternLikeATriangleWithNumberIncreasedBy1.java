package org.example.c02controlflow;

import java.util.Scanner;

/*
Write a program in Java to make such a pattern like a right angle triangle
with the number increased by 1.

The pattern like :

   1
   2 3
   4 5 6
   7 8 9 10

 */

public class DisplayAPatternLikeATriangleWithNumberIncreasedBy1 {
    public static void main(String[] args) {
        int count = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int numberOfRows = sc.nextInt();
        for (int i = 1; i <= numberOfRows; i++) {
            for (int j = 1; j <= i; j++) {
                count = count + 1;
                System.out.print(count + " ");
            }
            System.out.println();
        }
    }
}