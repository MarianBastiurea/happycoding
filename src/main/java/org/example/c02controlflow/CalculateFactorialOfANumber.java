package org.example.c02controlflow;

import java.util.Scanner;

/*
 Write a Java program to calculate the factorial of a given number.
 */

public class CalculateFactorialOfANumber {
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