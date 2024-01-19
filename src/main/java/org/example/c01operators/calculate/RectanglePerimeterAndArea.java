package org.example.c01operators.calculate;

/*
Write a Java program to compute the perimeter and area of a rectangle or square.
*/
class RectanglePerimeterAndArea {

    public static double[] findAreaAndPerimeter(double height, double width) {
        double area, perimeter;
        double[] result = new double[2];
        area = height * width;
        perimeter = (height + width) * 2;
        result[0] = area;
        result[1] = perimeter;
        return result;
    }
}