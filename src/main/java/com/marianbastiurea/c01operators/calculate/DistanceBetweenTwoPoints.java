package com.marianbastiurea.c01operators.calculate;

/*
Write a JAVA program to calculate the distance between two points.
We will input x,y coordinates of each point, we will
calculate distance between them using Pitagora's Theorem
*/
public class DistanceBetweenTwoPoints {
    private DistanceBetweenTwoPoints() {
    }


    public static double calculateDistance(double x1, double x2, double y1, double y2) {

        return Math.sqrt((y2 - y1) * (y2 - y1) + (x2 - x1) * (x2 - x1));
    }
}