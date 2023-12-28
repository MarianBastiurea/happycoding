package org.example;

import java.util.Scanner;

/* Write a Java program to display a pattern like a right angle triangle with a number.

The pattern like :

1
12
123
1234

https://www.w3resource.com/c-programming-exercises/for-loop/c-for-loop-exercises-10.php
 */

public class C03P10_Display_A_Pattern_Like_A_Triangle_Using_A_Number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int numberOfRows = sc.nextInt();
        for (int i = 1; i <= numberOfRows; ++i) {
            for (int j = 1; j <= i; ++j) {
                System.out.printf(j + " ");
            }
            System.out.println("");
        }
    }
}

