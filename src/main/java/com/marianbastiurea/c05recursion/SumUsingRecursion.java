package com.marianbastiurea.c05recursion;

/*
Write a program in Java to calculate the sum of numbers from 1 to n using recursion.
 */
public class SumUsingRecursion {
    private SumUsingRecursion() {
    }


    public static int sumFirstNNaturalNumbers(int start, int numbersToAdd) {
        //start is the first number to sum
        //numbersToAdd represent the number which will be sum
        int sum = 0;// sum of numbers
        if (numbersToAdd >= start) {
            sum = numbersToAdd + sumFirstNNaturalNumbers(start, numbersToAdd - 1);
        }
        return sum;
    }
}
