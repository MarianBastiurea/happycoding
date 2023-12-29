package org.example.c02controlflow;

import java.util.Scanner;

/*
Write a Java program that reads 5 numbers and sums all odd values between them.

We store all five elements in an array and
search for odds value in array and sum all
 */
public class SumOfOddsValue {
    public static void main(String[] args) {
        int sum = 0;
        int[] myArray = new int[5];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            System.out.print("Enter number:");
            myArray[i] = sc.nextInt();
        }
        for (int i = 0; i < 5; i++) {
            if (myArray[i] % 2 == 0) {
                sum = sum;
            } else {
                sum = sum + myArray[i];
            }
        }
        System.out.println("Sum of all odds number is: " + sum);
    }
}
