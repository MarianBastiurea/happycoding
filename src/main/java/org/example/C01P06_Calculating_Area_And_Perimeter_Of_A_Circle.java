package org.example;

/* Write a Java program to compute the perimeter and area of a circle with a given radius.
// https://www.w3resource.com/c-programming-exercises/basic-declarations-and-expressions/c-programming-basic-exercises-6.php
*/
class C01P06_Calculating_Area_And_Perimeter_Of_A_Circle {
    public static void main(String[] args) {
        double area;
        double perimeter;
        int radius = 6;
        perimeter = 2 * 3.14 * radius;
        area = 3.14 * radius * radius;
        System.out.println("Perimeter of the Circle is " + perimeter + " inches");
        System.out.println("Area of the Circle is " + area + " square inches");
    }
}
