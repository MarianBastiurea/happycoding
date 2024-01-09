package org.example.c02controlflow;

import java.util.Scanner;

/*
 Write a Java program to display the sum of n terms of even natural numbers.
 */

public class CalculatingSumOfANOfEvenTerms {
    public static void main(String[] args) {
        int count = 0;
        int sum = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int numberOfEvenTerms = sc.nextInt();
        System.out.println();
        System.out.print("First even terms are: ");
        for (int i = 1; i <= numberOfEvenTerms; i++) {
            count = count + 2;
            System.out.print(count + " ");
            sum = sum + count;
        }
        System.out.println();
        System.out.println("Sum of first even " + numberOfEvenTerms + " integers is: " + sum);
    }
}