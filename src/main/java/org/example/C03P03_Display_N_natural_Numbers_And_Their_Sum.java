package org.example;

import java.util.Scanner;
/*Write a program in Java to display n terms of natural numbers and their sum.
https://www.w3resource.com/c-programming-exercises/for-loop/index.php
 */

public class C03P03_Display_N_natural_Numbers_And_Their_Sum {
    public static void main(String[] args) {
        int numberOfIntegers;
        int sum = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of integers: ");
        numberOfIntegers = sc.nextInt();
        for (int i = 1; i <= numberOfIntegers; ++i) {
            System.out.print(i + " ");
        }
        for (int j = 1; j <= numberOfIntegers; ++j) {
            sum = sum + j;
        }
        System.out.println("");
        System.out.println("Sum of first " + numberOfIntegers + " integers is: " + sum);
    }
}