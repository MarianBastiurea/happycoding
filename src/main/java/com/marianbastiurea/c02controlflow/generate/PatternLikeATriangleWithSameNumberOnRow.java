package com.marianbastiurea.c02controlflow.generate;

/*
Write a program in Java to make such a pattern like a right angle triangle
with a number which will repeat a number in a row.

The pattern like :

 1
 22
 333
 4444

 */

public class PatternLikeATriangleWithSameNumberOnRow {
    private PatternLikeATriangleWithSameNumberOnRow () {}

    public static String generateTriangle(int number) {
        String result = "";
        for (int i = 1; i <= number; i++) {
            for (int j = 1; j <= i; j++) {
                result += (i + " ");
            }
            result = result.substring(0, result.length() - 1);
            result += "\n";
        }
        return result;
    }
}