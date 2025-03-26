package com.marianbastiurea.c02controlflow.generate;

/*
Write a Java program to make such a pattern as a pyramid with an asterisk.

   *
  * *
 * * *
* * * *

 */

public class PatternLikePyramidUsingAsterisk {
    private PatternLikePyramidUsingAsterisk() {
    }

    public static String generatePyramid(int number) {
        String result = "";
        String space = " ";
        int indentation = number - 1;
        for (int i = 1; i <= number; i++) {
            for (int j = indentation; j > 0; j--) {
                result += (" ");
            }
            indentation = indentation - 1;
            for (int k = 1; k <= i; k++) {
                result += "*" + space;
            }
            result = result.substring(0, result.length() - 1);
            result += "\n";
        }
        return result;
    }
}
