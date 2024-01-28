package com.marianbastiurea.c01operators.calculate;


/*
 Write a program in Java to display the cube of the number up to an integer.
*/

public class CubeOfNumber {
    private CubeOfNumber () {}

    public static int findCube(int number) {
        int cubeValue;
        cubeValue = number * number * number;
        return cubeValue;
    }
}