package org.example;

import java.util.Scanner;

/*Write a program in Java to read 10 numbers from the keyboard and find their sum and average.
https://www.w3resource.com/c-programming-exercises/for-loop/c-for-loop-exercises-4.php
 */

public class C03P04_Calculate_Sum_And_Average_Of_10_Given_Numbers {
    public static void main(String[] args) {
        double sum = 0;
        int[] myArray = new int[10];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 10; i++) {
            System.out.print("Enter number:");
            myArray[i] = sc.nextInt();
        }
        for (int i = 0; i < 10; i++) {
            sum = sum + myArray[i];
        }
        double average = sum / 10;
        System.out.print("Sum of given number is: " + sum);
        System.out.println();
        System.out.println("Average of given number is: " + String.format("%.2f", average));
    }
}