package org.example;

class C01P05Calculating_Area_And_Perimeter_Of_A_Triangle {

    public static void main(String[] args) {
        int height = 7;
        int width = 5;
        int a = 3;
        int b = 5;
        int c = 4;
        double area;
        int perimeter;
        area = height * width / 2;
        System.out.println("Triangle area is " + area + " square inches");
        perimeter = a + b + c;
        System.out.println("Perimeter of triangle is " + perimeter + " inches");
    }
}