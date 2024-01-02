package org.example.c04recursion;

/*
Write a program in C to calculate the sum of numbers from 1 to n using recursion.
 */
public class SumNumbersFrom1ToNUsingRecursion {

    public static int SumFirstNNaturalNumbers(int start, int NumbersToAdd) {
        //start is the first number to sum
        //NumbersToAdd represent the number which will be sum
        int sumOfNumbers = 0;// sum of numbers
        if (NumbersToAdd >= start) {
            sumOfNumbers = NumbersToAdd + SumFirstNNaturalNumbers(start, NumbersToAdd - 1);
        }
        return sumOfNumbers;
    }
}
