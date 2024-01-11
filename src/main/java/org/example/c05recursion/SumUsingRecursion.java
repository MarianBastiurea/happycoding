package org.example.c05recursion;

/*
Write a program in Java to calculate the sum of numbers from 1 to n using recursion.
 */
public class SumUsingRecursion {

    public static int sumFirstNNaturalNumbers(int start, int NumbersToAdd) {
        //start is the first number to sum
        //NumbersToAdd represent the number which will be sum
        int sum = 0;// sum of numbers
        if (NumbersToAdd >= start) {
            sum = NumbersToAdd + sumFirstNNaturalNumbers(start, NumbersToAdd - 1);
        }
        return sum;
    }
}
