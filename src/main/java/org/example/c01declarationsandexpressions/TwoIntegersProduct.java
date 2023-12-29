package org.example.c01declarationsandexpressions;

import java.util.Scanner;

/*
Write a Java program that accepts two integers from the user and calculates the product of the two integers.
*/
public class TwoIntegersProduct {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first integer:");
        int firstInteger = sc.nextInt();
        System.out.println("Enter second integer: ");
        int secondInteger = sc.nextInt();

        int product = firstInteger * secondInteger;

        System.out.println("Product is " + product);
    }
}