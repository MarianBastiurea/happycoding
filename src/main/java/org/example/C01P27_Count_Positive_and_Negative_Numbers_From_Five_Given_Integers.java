package org.example;

import java.util.Scanner;

/* Write a Java program that reads 5 numbers and counts the number of positive numbers and negative numbers.

https://www.w3resource.com/c-programming-exercises/basic-declarations-and-expressions/c-programming-basic-exercises-27.php
*/
public class C01P27_Count_Positive_and_Negative_Numbers_From_Five_Given_Integers {
    public static void main(String[] args) {
        int negativeNumbers = 0, positiveNumbers = 0;
        int[] myArray = new int[5];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            System.out.println("Enter number:");
            myArray[i] = sc.nextInt();
        }
        for (int i = 0; i < 5; i++) {
            if (myArray[i] < 0) {
                negativeNumbers = negativeNumbers + 1;
            } else {
                positiveNumbers = positiveNumbers + 1;
            }
        }
        System.out.println("there are: " + positiveNumbers + " positive numbers");
        System.out.println("there are: " + negativeNumbers + " negative numbers");
    }
}
