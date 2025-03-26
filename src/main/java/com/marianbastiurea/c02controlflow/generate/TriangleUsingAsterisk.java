package com.marianbastiurea.c02controlflow.generate;

/*
Write a program in Java to display a pattern like a right angle triangle using an asterisk.

The pattern like :

*
**
***
****

 */

public class TriangleUsingAsterisk {
    private TriangleUsingAsterisk() {
    }

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