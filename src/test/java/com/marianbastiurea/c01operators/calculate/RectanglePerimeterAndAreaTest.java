package com.marianbastiurea.c01operators.calculate;

import static org.junit.jupiter.api.Assertions.*;

import com.marianbastiurea.c01operators.calculate.RectanglePerimeterAndArea;
import org.junit.jupiter.api.Test;

public class RectanglePerimeterAndAreaTest {
    @Test
    public void givenHeight1AndWidth2ThenAreaIs2AndPerimeter6() {
        int height = 1, width = 2;
        int[] perimeterArea = {2,6};
        int[] result = RectanglePerimeterAndArea.findAreaAndPerimeter(height, width);
        assertArrayEquals(result, perimeterArea);
    }
}
