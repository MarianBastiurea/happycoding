package org.example;

public class C06P02_Sum_Numbers_From_1_To_N_Using_Recursion {

public static int SumFirstNNaturalNumbers(int start, int NumbersToAdd) {
    //start is the first number to sum
    //NumbersToAdd represent the number which will be sum
        int sumOfNumbers=0;// sum of numbers
        if (NumbersToAdd >= start) {
            sumOfNumbers=NumbersToAdd + SumFirstNNaturalNumbers(start, NumbersToAdd - 1);
        }
        return sumOfNumbers;
    }

}
