package org.example.c02controlflow.generate;

import java.util.Scanner;
/*
Write a program in Java to display a pattern like a right angle triangle using an asterisk.

The pattern like :

*
**
***
****

 */

public class TriangleUsingAsterisk {
    public static void main(String[] args) {
        String asterix = "*";
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows:");
        int numberOfRows = sc.nextInt();
        for (int i = 1; i <= numberOfRows; i++) {
            System.out.println(asterix.repeat(i)+" ");
        }
    }
}