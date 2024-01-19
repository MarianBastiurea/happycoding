package org.example.c01operators.calculate;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class RectanglePerimeterAndAreaTest {
    @Test
    public void rectangleShape() {
        double height = 7.5, width = 5.5;
        double[] perimeterArea = {41.25d, 26d};
        double[] result = RectanglePerimeterAndArea.findAreaAndPerimeter(height, width);
        assertArrayEquals(result, perimeterArea, 0.01);
    }

    @Test
    public void squareShape() {
        double height = 7.5, width = 7.5;
        double[] perimeterArea = {56.25, 30};
        double[] result = RectanglePerimeterAndArea.findAreaAndPerimeter(height, width);
        assertArrayEquals(result, perimeterArea, 0.01);
    }
}
