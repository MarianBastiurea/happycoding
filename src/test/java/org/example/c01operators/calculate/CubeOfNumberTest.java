package org.example.c01operators.calculate;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CubeOfNumberTest {
    @Test
    public void cubeOf2() {
        int number = 2;
        int cubeOfNumber = 8;
        int result = CubeOfNumber.findCube(number);
        assertEquals(cubeOfNumber, result);
    }

    @Test
    public void cubeOf8() {
        int number = 8;
        int cubeOfNumber = 512;
        int result = CubeOfNumber.findCube(number);
        assertEquals(cubeOfNumber, result);
    }

    @Test
    public void cubeOfNegative1() {
        int number = -1;
        int cubeOfNumber = -1;
        int result = CubeOfNumber.findCube(number);
        assertEquals(cubeOfNumber, result);
    }
}
