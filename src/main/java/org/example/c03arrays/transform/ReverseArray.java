package org.example.c03arrays.transform;

import java.util.Scanner;

/*
Write a program in Java to read n number of values in an array and display them in reverse order.
 */

public class ReverseArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input number of array's element: ");
        int numberOfElements = sc.nextInt();
        int[] myArray = new int[numberOfElements];
        for (int i = 0; i < numberOfElements; i++) {
            System.out.print("Input " + i + " element of array: ");
            myArray[i] = sc.nextInt();
            System.out.println();
        }
        System.out.print("Reverse order of array's elements: ");
        for (int j = numberOfElements - 1; j >= 0; j--) {
            System.out.print(myArray[j] + " ");
        }
    }
}