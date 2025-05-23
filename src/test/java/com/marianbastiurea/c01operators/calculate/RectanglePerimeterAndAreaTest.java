package com.marianbastiurea.c01operators.calculate;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

 class RectanglePerimeterAndAreaTest {
    @Test
  void givenHeight1AndWidth2ThenAreaIs2AndPerimeter6() {
        int height = 1, width = 2;
        int[] perimeterArea = {2, 6};
        int[] result = RectanglePerimeterAndArea.findAreaAndPerimeter(height, width);
        assertArrayEquals(result, perimeterArea);
    }
}
