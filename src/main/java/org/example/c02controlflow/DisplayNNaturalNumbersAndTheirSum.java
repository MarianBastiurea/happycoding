package org.example.c02controlflow;

import java.util.Scanner;
/*
Write a program in Java to display n terms of natural numbers and their sum.

 */

public class DisplayNNaturalNumbersAndTheirSum {
    public static void main(String[] args) {
        int numberOfIntegers;
        int sum = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of integers: ");
        numberOfIntegers = sc.nextInt();
        System.out.print("First " + numberOfIntegers + " integers are: ");
        for (int i = 1; i <= numberOfIntegers; i++) {
            System.out.print(i + " ");
        }
        for (int i = 1; i <= numberOfIntegers; i++) {
            sum = sum + i;
        }
        System.out.println();
        System.out.println("Sum of first " + numberOfIntegers + " integers is: " + sum);
    }
}