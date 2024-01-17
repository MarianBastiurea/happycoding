package org.example.c02controlflow.validate;

import java.util.Scanner;
/*
Write a Java program to check whether a number is a palindrome or not.
 */

public class NumberIsPalindrome {
    public static void main(String[] args) {
        int reverseNumber = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number to check if it is a palindrome: ");
        int number = sc.nextInt();
        int originalNumber = number;
        for (; number != 0; number = number / 10) {
            int remainder = number % 10;
            reverseNumber = reverseNumber * 10 + remainder;
        }
        if (originalNumber == reverseNumber) {
            System.out.println("The number " + originalNumber + " is a palindrome");
        } else {
            System.out.println("The number " + originalNumber + " is not a palindrome");
        }
    }
}