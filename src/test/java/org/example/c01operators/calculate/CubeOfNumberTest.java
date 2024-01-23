package org.example.c01operators.calculate;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CubeOfNumberTest {
    @Test
    public void given2CubeShouldBe8() {
        int number = 2;
        int cubeOfNumber = 8;
        int result = CubeOfNumber.findCube(number);
        assertEquals(cubeOfNumber, result);
    }
}
