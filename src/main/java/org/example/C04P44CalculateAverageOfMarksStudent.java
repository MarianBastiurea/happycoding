package org.example;

import java.util.Scanner;

public class C04P44CalculateAverageOfMarksStudent {
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


        //algoritm
        double average = getAverage(marks);

        //output
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