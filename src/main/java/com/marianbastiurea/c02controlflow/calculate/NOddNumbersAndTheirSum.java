package com.marianbastiurea.c02controlflow.calculate;


/*
Write a Java program to display the n terms of odd natural numbers and their sum.
 */

public class NOddNumbersAndTheirSum {
    private NOddNumbersAndTheirSum () {}

    public static int findSum(int[] myArray) {
        int sum = 0;
        for (int i : myArray) {
            sum = sum + i;
        }
        return sum;
    }
}