package org.example.c01operators.calculate;

import java.util.Scanner;

/*
Write a Java program that accepts two integers from the user and calculates the sum of the two integers.
*/
public class TwoIntegersSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first integer: ");
        int firstInteger = sc.nextInt();
        System.out.print("Enter second integer: ");
        int secondInteger = sc.nextInt();
        int sum = firstInteger + secondInteger;
        System.out.println("Sum is " + sum);
    }
}