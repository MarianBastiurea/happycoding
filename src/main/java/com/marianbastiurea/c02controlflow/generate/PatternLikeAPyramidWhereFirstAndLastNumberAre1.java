package com.marianbastiurea.c02controlflow.generate;

/*
Write a Java program to display a such a pattern for n rows using a number that starts with 1 and each row will have a 1 as the first and last number.

  1
 121
12321

 */

public class PatternLikeAPyramidWhereFirstAndLastNumberAre1 {
    private PatternLikeAPyramidWhereFirstAndLastNumberAre1() {
    }

    public static String generatePyramid(int number) {
        String pyramid = "";
        for (int i = 1; i <= number; i++) {
            for (int j = 1; j <= number - i; j++) {
                pyramid += "  ";
            }
            for (int k = 1; k <= i; k++) {
                pyramid += k + " ";
            }
            for (int l = i - 1; l >= 1; l--) {
                pyramid += l + " ";
            }
            pyramid = pyramid.substring(0, pyramid.length() - 1);
            pyramid += "\n";
        }
        return pyramid;
    }
}