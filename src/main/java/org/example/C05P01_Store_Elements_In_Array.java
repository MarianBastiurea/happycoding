package org.example;

/* Write a program in C to store elements in an array and print them.

https://www.w3resource.com/c-programming-exercises/array/c-array-exercise-1.php
 */


public class C05P01_Store_Elements_In_Array {
    public static void main(String[] args) {
        int[] myArray = new int[10];
        myArray[0] = 0;
        for (int i = 1; i <= 9; ++i) {
            myArray[i] = i;
        }
        for (int i = 0; i <= 9; ++i) {
            System.out.print(myArray[i] + " ");
        }
    }
}