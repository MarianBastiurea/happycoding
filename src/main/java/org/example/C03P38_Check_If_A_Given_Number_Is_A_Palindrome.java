package org.example;

import java.util.Scanner;
/* Write a Java program to check whether a number is a palindrome or not.

https://www.w3resource.com/c-programming-exercises/for-loop/c-for-loop-exercises-38.php

 */

public class C03P38_Check_If_A_Given_Number_Is_A_Palindrome {
    public static void main(String[] args) {
        int reverseNumber = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number to check if it is a palindrome: ");
        int givenNumber = sc.nextInt();
        int b = givenNumber;
        for (; givenNumber != 0; givenNumber = givenNumber / 10) {
            int remainder = givenNumber % 10;
            reverseNumber = reverseNumber * 10 + remainder;
        }
        if (b == reverseNumber) {
            System.out.println("The number " + b + " is a palindrome");
        } else {
            System.out.println("The number " + b + " is not a palindrome");
        }
    }
}