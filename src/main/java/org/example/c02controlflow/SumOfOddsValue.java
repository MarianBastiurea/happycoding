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
        int[] numbers = new int[5];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            System.out.print("Enter number:");
            numbers[i] = sc.nextInt();
        }
        for (int i = 0; i < 5; i++) {
            if (numbers[i] % 2 == 1) {
                sum = sum + numbers[i];
            }
        }
        System.out.println("Sum of all odds number is: " + sum);
    }
}
