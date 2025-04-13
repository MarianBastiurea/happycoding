package com.marianbastiurea.c02controlflow.generate;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

 class FloydTriangleTest {
    @Test
     void generateTriangle() {
        int number = 6;
        String triangle = FloydTriangle.generateTriangle(number);
        assertEquals("""
                1
                0 1
                1 0 1
                0 1 0 1
                1 0 1 0 1
                0 1 0 1 0 1
                """, triangle);
    }
}
