package org.example;

import java.util.Scanner;

/* Write a program in Java to make such a pattern like a right angle triangle
with a number which will repeat a number in a row.

The pattern like :

 1
 22
 333
 4444

 https://www.w3resource.com/c-programming-exercises/for-loop/c-for-loop-exercises-11.php
 */

public class C03P11_Display_A_Pattern_Like_A_Triangle_With_Same_Number_On_Row {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of rows: ");
        int numberOfRows = sc.nextInt();
        for (int i = 1; i <= numberOfRows; ++i) {
            for (int j = 1; j <= i; ++j) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
}