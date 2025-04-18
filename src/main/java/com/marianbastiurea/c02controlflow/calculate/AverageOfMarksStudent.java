package com.marianbastiurea.c02controlflow.calculate;

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

public class AverageOfMarksStudent {
    private AverageOfMarksStudent() {
    }


    public static double getAverage(int[] marks) {
        double sum = 0;
        double average = 0;
        if (marks.length > 0) {
            for (int mark : marks) {
                sum = sum + mark;
            }
            average = sum / marks.length;
        }
        return average;
    }
}