package org.example;

import java.util.Scanner;

/* Write a Java program to calculate the average mathematics marks of some students.
Input 0 (excluding to calculate the average) or a negative value to terminate the input process.
Test Data :
Input Mathematics marks (0 to terminate): 10
15
20
25
0
Expected Output:
Average marks in Mathematics: 17.50

https://www.w3resource.com/c-programming-exercises/basic-declarations-and-expressions/c-programming-basic-exercises-44.php
 */

public class C04P44_Calculate_Average_Of_Marks_Student {
    public static void main(String[] args) {
        //input
        int[] defaultMarks = new int[20];
        Scanner sc = new Scanner(System.in);
        System.out.println("Input student's mark one by one");
        System.out.println(" To finish this process, input 0 or a negative number: ");
        int mark;
        int numberOfIntroducedMarks = 0;
        do {
            mark = sc.nextInt();
            defaultMarks[numberOfIntroducedMarks] = mark;
            numberOfIntroducedMarks++;
        } while (mark > 0);
        int[] marks = new int[numberOfIntroducedMarks - 1];
        for (int i = 0; i < marks.length; i++) {
            marks[i] = defaultMarks[i];
        }
        double average = getAverage(marks);
        System.out.printf("Average is: %.2f", average);
    }

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