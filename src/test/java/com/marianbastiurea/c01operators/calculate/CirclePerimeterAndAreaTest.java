package com.marianbastiurea.c01operators.calculate;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CirclePerimeterAndAreaTest {

    @Test
    public void givenRadiusOneAreaShouldBeNumericValueOfPi() {
        double radius = 1;
        double area= 3.14d;
        double[] result = CirclePerimeterAndArea.getAreaAndPerimeter(radius);
        assertEquals(result[0], area, 0.01);
    }

    @Test
    public void givenRadiusOnePerimeterShouldBeDoubleNumericValueOfPi() {
        double radius = 1;
        double Perimeter = 6.28d;
        double[] result = CirclePerimeterAndArea.getAreaAndPerimeter(radius);
        assertEquals(result[1], Perimeter, 0.01);
    }
}