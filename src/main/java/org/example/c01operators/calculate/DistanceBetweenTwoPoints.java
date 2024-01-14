package org.example.c01operators.calculate;

import java.util.Scanner;

/*
Write a JAVA program to calculate the distance between two points.
We will input x,y coordinates of each point, we will
calculate distance between them using Pitagora's Theorem
*/
public class DistanceBetweenTwoPoints {

    public static double calculateDistance(double x1, double x2, double y1, double y2) {

        double distance = Math.sqrt((y2 - y1) * (y2 - y1) + (x2 - x1) * (x2 - x1));
        return distance;
    }
}