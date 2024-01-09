package org.example.c02controlflow;

import java.util.Scanner;

/*
Write a Java program to display the n terms of odd natural numbers and their sum.
 */

public class DisplayNOddNumbersAndTheirSum {
    public static void main(String[] args) {
        int sum = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int numberOfOddNumbers = sc.nextInt();
        int count=0;
        for (int oddNumber = 1; count < numberOfOddNumbers; oddNumber+=2) {
            System.out.print(oddNumber + " ");
            sum = sum + oddNumber;
            count++;
        }
        System.out.println();
        System.out.println("Sum is: " + sum);
    }
}