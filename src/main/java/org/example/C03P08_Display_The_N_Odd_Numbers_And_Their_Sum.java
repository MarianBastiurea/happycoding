package org.example;

import java.util.Scanner;

/* Write a Java program to display the n terms of odd natural numbers and their sum.
https://www.w3resource.com/c-programming-exercises/for-loop/c-for-loop-exercises-8.php
 */

public class C03P08_Display_The_N_Odd_Numbers_And_Their_Sum {
    public static void main(String[] args) {
        int oddNumber = -1;
        int sum = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int givenNumber = sc.nextInt();
        for (int i = 1; i <= givenNumber; ++i) {
            oddNumber = oddNumber + 2;
            System.out.print(oddNumber + " ");
            sum = sum + oddNumber;
        }
        System.out.println();
        System.out.println("Sum is: " + sum);
    }
}