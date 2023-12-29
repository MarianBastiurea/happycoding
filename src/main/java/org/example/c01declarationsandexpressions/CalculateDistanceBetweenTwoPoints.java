package org.example.c01declarationsandexpressions;

import java.util.Scanner;

/*
Write a JAVA program to calculate the distance between two points.
We will input x,y coordinates of each point and we will
calculate distance between them using Pitagora's Theorem

*/
public class CalculateDistanceBetweenTwoPoints {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter x1 value:");
        int x1 = sc.nextInt();
        System.out.println();
        System.out.print("Enter y1 value:");
        int y1 = sc.nextInt();
        System.out.println();
        System.out.print("Enter x2 value:");
        int x2 = sc.nextInt();
        System.out.println();
        System.out.print("Enter y2 value:");
        int y2 = sc.nextInt();
        double distance = Math.sqrt((y2 - y1) * (y2 - y1) + (x2 - x1) * (x2 - x1));
        System.out.println("Distance is: " + distance);
    }
}