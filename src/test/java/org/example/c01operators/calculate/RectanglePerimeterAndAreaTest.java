package org.example.c01operators.calculate;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class RectanglePerimeterAndAreaTest {
    @Test
    public void rectangle() {
        int height = 7, width = 5;
        int[] perimeterArea = {24, 35};
        int[] result = RectanglePerimeterAndArea.findAreaAndPerimeter(height, width);
        assertArrayEquals(result, perimeterArea);
    }

    @Test
    public void square() {
        int height = 7, width = 7;
        int[] perimeterArea = {28, 49};
        int[] result = RectanglePerimeterAndArea.findAreaAndPerimeter(height, width);
        assertArrayEquals(result, perimeterArea);
    }
}
