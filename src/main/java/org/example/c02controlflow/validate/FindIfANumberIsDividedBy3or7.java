package org.example.c02controlflow.validate;
/*
Write a Java program that checks if a positive integer is divisible by either 3 or 7,
or both. If the integer is a multiple of 3, then the program will return true.
 Similarly, if the integer is a multiple of 7, then also the program will return true.
 If the integer is not a multiple of 3 or 7, then the program will return false.
*/

import java.util.Scanner;

public class FindIfANumberIsDividedBy3or7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter integer:");
        int number = sc.nextInt();
        if ((number % 3 != 0) && (number % 7 != 0)) {
            System.out.println("Number is not divided by 3 or 7");
        }
        if (number % 3 == 0) {
            System.out.println("Number is divided by 3");
        }
        if (number % 7 == 0) {
            System.out.println("Number is divided by 7");
        }
    }
}