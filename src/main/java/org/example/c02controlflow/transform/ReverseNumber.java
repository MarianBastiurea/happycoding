package org.example.c02controlflow.transform;

import java.util.Scanner;

/*
Write a program in C to display the number in reverse order.
 */

public class ReverseNumber {
    public static void main(String[] args) {
        int reverseNumber = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number to revert: ");
        int number = sc.nextInt();
        for (; number != 0; number = number / 10) {
            int remainder = number % 10;
            reverseNumber = reverseNumber * 10 + remainder;
        }
        System.out.println("The reverse of the number is: " + reverseNumber);
    }
}
