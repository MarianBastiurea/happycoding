package com.marianbastiurea.c02controlflow.generate;

import java.util.Scanner;

/*
Write a program in Java to display the multiplier table vertically from 1 to n.
 */
public class MultiplierTableFrom1ToNumber {
    private MultiplierTableFrom1ToNumber () {}

    public static String multiplyNumber(int number) {
        String result = "";
        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= number; ++j) {
                result += i + "x" + j + "=" + i * j;
                result += "\n";
            }
        }
        return result;
    }
}