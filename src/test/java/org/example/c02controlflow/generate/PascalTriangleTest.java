package org.example.c02controlflow.generate;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class PascalTriangleTest {
    @Test
    public void generateTriangle() {
        int number = 6;
        String result = PascalTriangle.generateTriangle(number);
        assertEquals("""
                      1
                     1 1
                    1 2 1
                   1 3 3 1
                  1 4 6 4 1
                 1 5 10 10 5 1  
                """, result);
    }
}
