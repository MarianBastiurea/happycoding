package org.example.c02controlflow.validate;

import java.util.Scanner;

/*
 Write a Java program to check whether a given number is a 'Perfect' number or not.
Perfect number is a positive number which sum of all positive divisors excluding
that number is equal to that number. For example, 6 is a perfect number since the
divisors of 6 are 1, 2, and 3. Sum of its divisors is 1 + 2 + 3 = 6

 */

public class FindIfANumberIsAPerfectNumber {
    public static void main(String[] args) {
        int sum = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter integer: ");
        int number = sc.nextInt();
        for (int i = 1; i < number; i++) {
            if (number % i == 0) {
                System.out.print(i + " ");
                sum = sum + i;
            }
        }
        if (sum == number) {
            System.out.println(" The sum is: " + sum);
            System.out.println("Number " + number + " is perfect number");
        }
    }
}