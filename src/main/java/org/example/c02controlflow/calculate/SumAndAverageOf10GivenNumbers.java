package org.example.c02controlflow.calculate;

import java.util.Scanner;

/*
Write a program in Java to read 10 numbers from the keyboard and find their sum and average.
 */

public class SumAndAverageOf10GivenNumbers {
    public static void main(String[] args) {
        double sum = 0;
        int[] numbers = new int[10];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 10; i++) {
            System.out.print("Enter number:");
            numbers[i] = sc.nextInt();
        }
        for (int i = 0; i < 10; i++) {
            sum = sum + numbers[i];
        }
        double average = sum / 10;
        System.out.print("Sum of given number is: " + sum);
        System.out.println();
        System.out.println("Average of given number is: " + String.format("%.2f", average));
    }
}