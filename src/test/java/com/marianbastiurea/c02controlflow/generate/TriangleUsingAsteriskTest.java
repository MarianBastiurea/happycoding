package com.marianbastiurea.c02controlflow.generate;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

 class TriangleUsingAsteriskTest {
    @Test
    void given6RowsGenerateAPatternLikeTriangleUsingAsterisk() {
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
