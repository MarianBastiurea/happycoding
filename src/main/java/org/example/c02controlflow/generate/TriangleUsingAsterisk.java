package org.example.c02controlflow.generate;

import java.util.Scanner;
/*
Write a program in Java to display a pattern like a right angle triangle using an asterisk.

The pattern like :

*
**
***
****

 */

public class TriangleUsingAsterisk {
    public static String generateTriangle(int number) {
        String asterix = "*";
        String result = "";
        for (int i = 1; i <= number; i++) {
            result += asterix.repeat(i);
            result += "\n";
        }
        return result;
    }
}