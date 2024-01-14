package org.example.c01operators.calculate;

/*
Write a Java program to compute the perimeter and area of a rectangle or square.
*/
class RectanglePerimeterAndArea {

    public static int[] findAreaAndPerimeter(int height, int width) {
        int area, perimeter;
        int[] result = new int[2];
        area = height * width;
        perimeter = (height + width) * 2;
        result[0] = perimeter;
        result[1] = area;
        return result;
    }
}