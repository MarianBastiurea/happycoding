package org.example.c02controlflow.generate;

/*
Write a Java program to display Pascal's triangle.
 Test Data :
Input number of rows: 5
Expected Output :

        1
      1   1
    1   2   1
  1   3   3   1
1   4   6   4   1

 */

public class PascalTriangle {
    public static String generateTriangle(int number) {
        String result = "";
        for (int i = 1; i <= number; i++) {
            for (int j = 0; j <= number - i; j++) {
                result += " ";
            }
            int l = 1;
            for (int k = 1; k <= i; k++) {
                result += l + " ";
                l = l * (i - k) / k;
            }
            result = result.substring(0, result.length() - 1);
            result += "\n";
        }
        return result;
    }
}