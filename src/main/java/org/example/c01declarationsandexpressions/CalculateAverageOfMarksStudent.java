package org.example.c01declarationsandexpressions;

import java.util.Scanner;

/*
Write a Java program to calculate the average mathematics marks of some students.
Input 0 (excluding to calculate the average) or a negative value to terminate the input process.
Test Data :
Input Mathematics marks (0 to terminate): 10
15
20
25
0
Expected Output:
Average marks in Mathematics: 17.50
*/

public class CalculateAverageOfMarksStudent {

    public static double getAverage(int[] marks) {
        double sum = 0;
        double average = 0;
        if (marks.length > 0) {
            for (int i = 0; i < marks.length; i++) {
                sum = sum + marks[i];
            }
            average = sum / marks.length;
        }
        return average;
    }
}