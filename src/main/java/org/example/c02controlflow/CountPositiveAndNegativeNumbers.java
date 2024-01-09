package org.example.c02controlflow;

import java.util.Scanner;

/*
Write a Java program that reads 5 numbers and counts the number of positive numbers and negative numbers.
*/
public class CountPositiveAndNegativeNumbers {
    public static void main(String[] args) {
        int negativeNumbers = 0, positiveNumbers = 0;
        int[] numbers = new int[5];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            System.out.println("Enter number:");
            numbers[i] = sc.nextInt();
        }
        for (int i = 0; i < 5; i++) {
            if (numbers[i] < 0) {
                negativeNumbers++;
            } else {
                positiveNumbers++;
            }
        }
        System.out.println("there are: " + positiveNumbers + " positive numbers");
        System.out.println("there are: " + negativeNumbers + " negative numbers");
    }
}
