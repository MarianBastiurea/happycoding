package org.example.c02controlflow.calculate;


/*
Write a Java program that accepts three integers and finds the maximum of three.
*/
public class MaxOfThreeNumbers {

    public static int findMax(int firstNumber, int secondNumber, int thirdNumber) {

        int max;
        if (firstNumber > secondNumber) {
            if (thirdNumber > firstNumber) {
                max = thirdNumber;
            } else {
                max = firstNumber;
            }
        } else {
            if (thirdNumber > secondNumber) {
                max = thirdNumber;
            } else {
                max = secondNumber;
            }
        }
        return max;
    }
}