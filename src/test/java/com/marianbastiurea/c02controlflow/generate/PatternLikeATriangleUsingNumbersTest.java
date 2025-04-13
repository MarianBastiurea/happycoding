package com.marianbastiurea.c02controlflow.generate;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

 class PatternLikeATriangleUsingNumbersTest {
    @Test
    void generateTriangle() {
        int number = 5;
        String result = PatternLikeATriangleUsingNumbers.generateTriangle(number);
        assertEquals(""" 
                1
                1 2
                1 2 3
                1 2 3 4
                1 2 3 4 5
                """, result);
    }
}
