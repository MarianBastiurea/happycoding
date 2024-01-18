package org.example.c01operators.calculate;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CirclePerimeterAndAreaTest {

    @Test
    public void RadiusOne() {
        double radius = 1;
        double[] areaAndPerimeter = {3.14d, 6.28d};
        double[] result = CirclePerimeterAndArea.getAreaAndPerimeter(radius);
        assertArrayEquals(result, areaAndPerimeter, 0.01);
    }

    @Test
    public void RadiusFivePointSix() {
        double radius = 5.6;
        double[] areaAndPerimeter = {98.47d, 35.17d};
        double[] result = CirclePerimeterAndArea.getAreaAndPerimeter(radius);
        assertArrayEquals(result, areaAndPerimeter, 0.01);
    }

    @Test
    public void sameAreaAndPerimeter() {
        double radius = 2;
        double[] areaAndPerimeter = {12.56d, 12.56d};
        double[] result = CirclePerimeterAndArea.getAreaAndPerimeter(radius);
        assertArrayEquals(result, areaAndPerimeter, 0.01);
    }
}