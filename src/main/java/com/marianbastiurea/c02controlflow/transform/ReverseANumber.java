package com.marianbastiurea.c02controlflow.transform;

/*
Write a program in Java to display the number in reverse order.
 */

public class ReverseANumber {
    private ReverseANumber() {
    }

    public static int reverse(int number) {
        int reverseNumber = 0;
        for (; number != 0; number = number / 10) {
            int remainder = number % 10;
            reverseNumber = reverseNumber * 10 + remainder;
        }
        return reverseNumber;
    }
}
