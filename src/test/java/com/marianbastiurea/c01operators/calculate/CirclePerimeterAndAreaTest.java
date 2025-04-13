package com.marianbastiurea.c01operators.calculate;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CirclePerimeterAndAreaTest {

    @Test
    void givenRadiusOneAreaShouldBeNumericValueOfPi() {
        double radius = 1;
        double area = 3.14d;
        double[] result = CirclePerimeterAndArea.getAreaAndPerimeter(radius);
        assertEquals(result[0], area, 0.01);
    }

    @Test
    void givenRadiusOnePerimeterShouldBeDoubleNumericValueOfPi() {
        double radius = 1;
        double perimeter = 6.28d;
        double[] result = CirclePerimeterAndArea.getAreaAndPerimeter(radius);
        assertEquals(result[1], perimeter, 0.01);
    }
}