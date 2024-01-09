package org.example.c02controlflow;

import java.util.Scanner;
/*
 Write a Java program to determine whether a given number is prime or not.
*/

public class CheckIfANumberIsPrime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter integer: ");
        int number = sc.nextInt();
        int divisors = 1;// give divisors value 1 is for division by 1
        for (int i = 2; i <= number; i++) {
            if (number % i == 0) {
                divisors++;
            }
        }
        if (divisors > 2) {
            System.out.println("Number " + number + " is not  prime number");
        } else {
            System.out.println("Number " + number + " is  prime number");
        }
    }
}
