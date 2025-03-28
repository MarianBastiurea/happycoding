package com.marianbastiurea.c02controlflow.generate;

/*
Write a Java program to make such a pattern like a pyramid with a
number which will repeat the number in the same row.

   1
  2 2
 3 3 3
4 4 4 4

 */
public class PatternLikePyramidWithANumberRepeatingInSameRow {
    private PatternLikePyramidWithANumberRepeatingInSameRow() {
    }

    public static String generatePyramid(int number) {
        int indentation;
        String result = "";
        indentation = number - 1;
        for (int i = 1; i <= number; i++) {
            for (int j = indentation; j > 0; j--) {
                result += " ";
            }
            indentation = indentation - 1;
            for (int k = 1; k <= i; k++) {
                result += i + " ";
            }
            result = result.substring(0, result.length() - 1);
            result += "\n";
        }
        return result;
    }
}