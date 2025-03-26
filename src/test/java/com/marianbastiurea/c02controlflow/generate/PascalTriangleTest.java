package com.marianbastiurea.c02controlflow.generate;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PascalTriangleTest {
    @Test
    public void first4rows() {
        int number = 5;
        String triangle = PascalTriangle.builtTriangle(number);
        assertEquals("""
                     1
                    1 1
                   1 2 1
                  1 3 3 1
                 1 4 6 4 1
                """, triangle);
    }
}
