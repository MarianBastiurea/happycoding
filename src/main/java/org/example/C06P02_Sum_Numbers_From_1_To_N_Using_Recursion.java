package org.example;

public class C06P02_Sum_Numbers_From_1_To_N_Using_Recursion {

public static int SumFirstNNaturalNumbers(int start, int NumbersToAdd) {
        int sumOfNumbers=0;
        if (NumbersToAdd >= start) {
            sumOfNumbers=NumbersToAdd + SumFirstNNaturalNumbers(start, NumbersToAdd - 1);
        }
        return sumOfNumbers;
    }

}
