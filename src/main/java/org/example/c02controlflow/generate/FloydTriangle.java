package org.example.c02controlflow.generate;

/*
Write a program in Java to print Floyd's Triangle.

1
01
101
0101
10101

 */

public class FloydTriangle {
    public static String generateTriangle(int number) {
       String triangle="";
       String spaces=" ";
        for (int i = 1; i <= number; i++) {
            if (i % 2 == 0) {
                for (int j = 1; j <= i; j++) {
                    if (j % 2 == 0) {
                        triangle+="1"+spaces;
                    } else {
                        triangle+="0"+spaces;
                    }
                }
            } else {
                for (int j = 1; j <= i; j++) {
                    if (j % 2 == 0) {
                        triangle+="0"+spaces;
                    } else {
                        triangle+="1"+spaces;
                    }
                }
            }
            triangle=triangle.substring(0, triangle.length() - 1);
            triangle+="\n";
        }
        return triangle;
    }
}