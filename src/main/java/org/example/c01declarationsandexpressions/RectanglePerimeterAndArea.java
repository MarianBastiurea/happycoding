package org.example.c01declarationsandexpressions;

/*
Write a Java program to compute the perimeter and area of a rectangle with a height of 7 inches and width of 5 inches.
*/
class RectanglePerimeterAndArea {

    public static void main(String[] args) {
        int height = 7, width = 5;
        double area;
        int perimeter;

        area = height * width;
        perimeter = (height + width)*2;

        System.out.println("Rectangle area is " + area + " square inches");
        System.out.println("Perimeter of Rectangle is " + perimeter + " inches");
    }
}