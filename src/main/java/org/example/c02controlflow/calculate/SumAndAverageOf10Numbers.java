package org.example.c02controlflow.calculate;

/*
Write a program in Java to read 10 numbers from the keyboard and find their sum and average.
 */

public class SumAndAverageOf10Numbers {
    public static double[] findSum(double[] myArray) {
        double sum = 0;
        double[] result = new double[2];
        for (double i : myArray) {
            sum = sum + i;
        }
        double average = sum / 10;
        result[0] = sum;
        result[1] = average;
        return result;
    }
}