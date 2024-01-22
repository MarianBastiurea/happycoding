package org.example.c03arrays.insert;

// Write a program in Java to store elements in an array and print them.


public class StoreElementsInArray {
    public static void main(String[] args) {
        int[] myArray = new int[10];
        myArray[0] = 0;
        for (int i = 1; i <= 9; i++) {
            myArray[i] = i;
        }
        for (int i = 0; i <= 9; i++) {
            System.out.print(myArray[i] + " ");
        }
    }
}