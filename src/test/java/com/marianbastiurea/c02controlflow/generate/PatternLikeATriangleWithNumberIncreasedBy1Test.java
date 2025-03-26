package com.marianbastiurea.c02controlflow.generate;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PatternLikeATriangleWithNumberIncreasedBy1Test {
    @Test
    public void given5RowsGenerateAPatternLikeTriangleWithNumberIncreasedBy1() {
        int number = 5;
        String result = PatternLikeATriangleWithNumberIncreasedBy1.generateTriangle(number);
        assertEquals("""
                1
                2 3
                4 5 6
                7 8 9 10
                11 12 13 14 15
                """, result);
    }
}
