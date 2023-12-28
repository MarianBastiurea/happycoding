package org.example;

import java.util.Scanner;

/* Write a Java program to calculate the factorial of a given number.
https://www.w3resource.com/c-programming-exercises/for-loop/c-for-loop-exercises-15.php

 */

public class C03P15_Calculate_Factorial_Of_A_Given_Number {
    public static void main(String[] args) {
        int factorial = 1;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter integer:");
        int givenNumber = sc.nextInt();
        for (int i = 1; i <= givenNumber; ++i) {
            factorial = factorial * i;
        }
        System.out.println("factorial of " + givenNumber + " is " + factorial);
    }
}