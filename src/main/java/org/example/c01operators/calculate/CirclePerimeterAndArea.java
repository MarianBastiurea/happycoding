package org.example.c01operators.calculate;

/*
Write a Java program to compute the perimeter and area of a circle with a given radius.
*/
class CirclePerimeterAndArea {

    public static double getArea(double PI, int radius) {
        double area;
        area = PI * radius * radius;
        return area;
    }

    public static double getPerimeter(double PI, int radius) {
        double perimeter;
        perimeter = 2 * PI * radius;
        return perimeter;
    }
}
