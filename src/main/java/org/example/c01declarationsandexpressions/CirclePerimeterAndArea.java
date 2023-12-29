package org.example.c01declarationsandexpressions;

/*
Write a Java program to compute the perimeter and area of a circle with a given radius.
*/
class CirclePerimeterAndArea {
    public static void main(String[] args) {
        double area;
        double perimeter;
        int radius = 6;
        double PI = 3.14;

        perimeter = 2 * PI * radius;
        area = PI * radius * radius;

        System.out.println("Perimeter of the Circle is " + perimeter + " inches");
        System.out.println("Area of the Circle is " + area + " square inches");
    }
}
