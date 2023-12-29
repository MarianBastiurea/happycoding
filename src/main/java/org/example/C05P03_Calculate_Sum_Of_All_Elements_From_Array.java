package org.example;

import java.util.Scanner;

/* Write a program in Java to find the sum of all elements of the array.

https://www.w3resource.com/c-programming-exercises/array/c-array-exercise-3.php
 */

public class C05P03_Calculate_Sum_Of_All_Elements_From_Array {
    public static void main(String[] args) {
        int sum = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Input number of array's element: ");
        int numberOfElements = sc.nextInt();
        int[] myArray = new int[numberOfElements];
        for (int i = 0; i < numberOfElements; ++i) {
            System.out.print("Input " + i + " element of array: ");
            myArray[i] = sc.nextInt();
            sum = sum + myArray[i];
            System.out.println();
        }
        System.out.print("Sum of array's elements is: " + sum);
    }
}