package com.marianbastiurea.c02controlflow.generate;


/*
Write a Java program to display a pattern like a right angle triangle with a number.

The pattern like :

1
12
123
1234

 */

public class PatternLikeATriangleUsingNumbers {
    private PatternLikeATriangleUsingNumbers() {
    }

    public static String generateTriangle(int number) {
        String result = "";
        for (int i = 1; i <= number; i++) {
            for (int j = 1; j <= i; j++) {
                result += j + " ";
            }
            result = result.substring(0, result.length() - 1);
            result += "\n";
        }
        return result;
    }
}

