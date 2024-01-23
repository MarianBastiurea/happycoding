package org.example.c02controlflow.generate;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class PatternLikeATriangleUsingNumbersTest {
    @Test
    public void generateTriangle() {
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
