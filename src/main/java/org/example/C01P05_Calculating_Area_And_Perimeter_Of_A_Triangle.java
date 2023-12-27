package org.example;

/* Write a Java program to compute the perimeter and area of a rectangle with
a height of 7 inches and width of 5 inches.

 https://www.w3resource.com/c-programming-exercises/basic-declarations-and-expressions/c-programming-basic-exercises-5.php
*/
class C01P05_Calculating_Area_And_Perimeter_Of_A_Triangle {

    public static void main(String[] args) {
        int height = 7, width = 5, sideAB = 3, sideBC = 5, sideCA = 4;
        double area;
        int perimeter;
        area = height * width / 2;
        System.out.println("Triangle area is " + area + " square inches");
        perimeter = sideAB + sideBC + sideCA;
        System.out.println("Perimeter of triangle is " + perimeter + " inches");
    }
}