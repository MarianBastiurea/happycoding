package com.marianbastiurea.c01operators.calculate;

import static org.junit.jupiter.api.Assertions.*;

import com.marianbastiurea.c01operators.calculate.DistanceBetweenTwoPoints;
import org.junit.jupiter.api.Test;

public class DistanceBetweenTwoPointsTest {
    @Test
    public void horizontalLine() {
        double x1 = 10.00, x2 = 20.00, y1 = 10.00, y2 = 10.00;
        double distance = 10;
        double result = DistanceBetweenTwoPoints.calculateDistance(x1, x2, y1, y2);
        assertEquals(distance, result);
    }

    @Test
    public void verticalLine() {
        double x1 = 10.00, x2 = 10.00, y1 = 10.00, y2 = 20.00;
        double distance = 10;
        double result = DistanceBetweenTwoPoints.calculateDistance(x1, x2, y1, y2);
        assertEquals(distance, result);
    }

    @Test
    public void otherLine() {
        double x1 = 10.00, x2 = 20.00, y1 = 30.00, y2 = 10.00;
        double distance = 22.36d;
        double result = DistanceBetweenTwoPoints.calculateDistance(x1, x2, y1, y2);
        assertEquals(result, distance, 0.01);
    }
}
