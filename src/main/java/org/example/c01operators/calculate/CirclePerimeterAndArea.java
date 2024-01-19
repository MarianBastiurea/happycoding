package org.example.c01operators.calculate;

/*
Write a Java program to compute the perimeter and area of a circle with a given radius.
*/
class CirclePerimeterAndArea {

    public static double[] getAreaAndPerimeter(double radius) {
        double area;
        double perimeter;
        double PI = 3.14;
        double[] result = new double[2];
        area = PI * radius * radius;
        perimeter = 2 * PI * radius;
        result[0] = area;
        result[1] = perimeter;
        return result;
    }
}
