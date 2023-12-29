package org.example;

import java.util.Scanner;

/* Write a program in C to copy the elements of one array into another array.

https://www.w3resource.com/c-programming-exercises/array/c-array-exercise-4.php
 */

public class C05P04_Copy_Elements_From_Array_In_Other_Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input number of array's element: ");
        int numberOfElements = sc.nextInt();
        int[] myArray = new int[numberOfElements];
        int[] copyArray = new int[numberOfElements];
        for (int i = 0; i < numberOfElements; ++i) {
            System.out.print("Input " + i + " element of array: ");
            myArray[i] = sc.nextInt();
        }
        System.out.print("Elements of first array are: ");
        for (int i = 0; i < numberOfElements; ++i) {
            System.out.print(" " + myArray[i]);
        }
        System.out.println();
        for (int i = 0; i < numberOfElements; ++i) {
            copyArray[i] = myArray[i];
        }
        System.out.print("Elements of copy array are: ");
        for (int i = 0; i < numberOfElements; ++i) {
            System.out.print(myArray[i] + " ");
        }
    }
}