package org.example.c02controlflow.validate;

import java.util.Scanner;

/*
Write a Java program that checks if a given non-negative number is a multiple of 3 or 7, but not both
*/
public class NumberIsDividedBy3 {

    public static void main(String[] args) {
        int number;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter integer:");
        number = sc.nextInt();
        if (number % 3 == 0) {
            System.out.println("Number is divided by 3");
        } else {
            System.out.println("Number is not divided by 3");
        }
    }
}