package org.example.c03arrays.insert;

// Write a program in Java to store 10 elements in an array and print them.


public class StoreElementsInArray {
    private StoreElementsInArray () {}

    public static int[] storeElements(int number) {
        int[] myArray = new int[10];
        for (int i = 0; i <myArray.length; i++) {
            myArray[i] = number+i;}
        return myArray;
    }}