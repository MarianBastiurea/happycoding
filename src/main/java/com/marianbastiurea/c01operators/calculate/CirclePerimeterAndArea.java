package com.marianbastiurea.c01operators.calculate;

/*
Write a Java program to compute the perimeter and area of a circle with a given radius.
*/
class CirclePerimeterAndArea {
    private CirclePerimeterAndArea() {
    }


    public static double[] getAreaAndPerimeter(double radius) {
        double area;
        double perimeter;
        double pi = 3.14;
        double[] result = new double[2];
        area = pi * radius * radius;
        perimeter = 2 * pi * radius;
        result[0] = area;
        result[1] = perimeter;
        return result;
    }
}
