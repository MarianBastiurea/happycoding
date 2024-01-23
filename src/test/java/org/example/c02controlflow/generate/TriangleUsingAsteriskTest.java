package org.example.c02controlflow.generate;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TriangleUsingAsteriskTest {
    @Test
    public void given6RowsGenerateAPatternLikeTriangleUsingAsterisk() {
        int number = 6;
        String result = TriangleUsingAsterisk.generateTriangle(number);
        assertEquals("""
                *
                **
                ***
                ****
                *****
                ******
                """, result);
    }
    }
