package org.example;

import java.util.Scanner;

/*  Write a Java program to display Pascal's triangle.
 Test Data :
Input number of rows: 5
Expected Output :

        1
      1   1
    1   2   1
  1   3   3   1
1   4   6   4   1

https://www.w3resource.com/c-programming-exercises/for-loop/c-for-loop-exercises-33.php

 */

public class C03P33_Displays_Pascal_Triangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int numberOfRows = sc.nextInt();
        for (int i = 1; i <= numberOfRows; ++i) {
            for (int j = 0; j <= numberOfRows - i; ++j) {
                System.out.print(" ");
            }
            int l = 1;
            for (int k = 1; k <= i; ++k) {
                System.out.print(l + " ");
                l = l * (i - k) / k;
            }
            System.out.println();
        }
    }
}