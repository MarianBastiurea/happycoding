package org.example.c01operators.calculate;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CirclePerimeterAndAreaTest {

    @Test
    public void givenRadiusOneAreaShouldBeNumericValueOfPiAndPerimeterShouldBeDoubleNumericValueOfPi() {
        double radius = 1;
        double[] areaAndPerimeter = {3.14d, 6.28d};
        double[] result = CirclePerimeterAndArea.getAreaAndPerimeter(radius);
        assertArrayEquals(result, areaAndPerimeter, 0.01);
    }
}