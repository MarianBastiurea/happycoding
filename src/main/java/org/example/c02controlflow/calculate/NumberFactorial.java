package org.example.c02controlflow.calculate;

import java.util.Scanner;

/*
 Write a Java program to calculate the factorial of a given number.
 */

public class NumberFactorial {
    public static void main(String[] args) {
        int factorial = 1;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter integer:");
        int number = sc.nextInt();
        for (int i = 1; i <= number; i++) {
            factorial = factorial * i;
        }
        System.out.println("factorial of " + number + " is " + factorial);
    }
}