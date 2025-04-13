package com.marianbastiurea.c01operators.calculate;

/*
Write a Java program to compute the perimeter and area of a rectangle or square.
*/
class RectanglePerimeterAndArea {
    private RectanglePerimeterAndArea() {
    }


    public static int[] findAreaAndPerimeter(int height, int width) {
        int area;
        int perimeter;
        int[] result = new int[2];
        area = height * width;
        perimeter = (height + width) * 2;
        result[0] = area;
        result[1] = perimeter;
        return result;
    }
}