package org.example.c02controlflow.calculate;


/*
Write a Java program that accepts three integers and finds the maximum of three.
*/
public class MaxOfThreeNumbers {
    private MaxOfThreeNumbers () {}


    public static int findMax(int firstNumber, int secondNumber, int thirdNumber) {
        int max = firstNumber;
        if (secondNumber > firstNumber) {
            max = secondNumber;
        }
        if (thirdNumber > max) {
            max = thirdNumber;
        }
        return max;
    }
}