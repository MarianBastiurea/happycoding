package org.example.c02controlflow.generate;

/*
Write a program in Java to make such a pattern like a right angle triangle
with the number increased by 1.

The pattern like :

   1
   2 3
   4 5 6
   7 8 9 10

 */

public class PatternLikeATriangleWithNumberIncreasedBy1 {
    public static String generateTriangle(int number) {
        int count = 0;
        String result = "";
        for (int i = 1; i <= number; i++) {
            for (int j = 1; j <= i; j++) {
                count = count + 1;
                result += count + " ";
            }
            result = result.substring(0, result.length() - 1);
            result += "\n";
        }
        return result;
    }
}