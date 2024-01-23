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
    public static String builtTriangle(int number) {
        String triangle = "";
        for (int i = 1; i <= number; i++) {
            for (int j = 0; j <= number - i; j++) {
                triangle += " ";
            }
            int l = 1;
            for (int k = 1; k <= i; k++) {
                triangle += l + " ";
                l = l * (i - k) / k;
            }
            triangle = triangle.substring(0, triangle.length() - 1);
            triangle += "\n";
        }
        return triangle;

    }
}