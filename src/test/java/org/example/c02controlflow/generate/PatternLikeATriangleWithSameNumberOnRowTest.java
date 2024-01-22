package org.example.c02controlflow.generate;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class PatternLikeATriangleWithSameNumberOnRowTest {
    @Test
    public void given6RowsGenerateAPatternLikeATriangleWithSameNumberOnRow() {
        int number = 6;
        String result = PatternLikeATriangleWithSameNumberOnRow.generateTriangle(number);
        assertEquals("""
                1
                2 2
                3 3 3
                4 4 4 4
                5 5 5 5 5
                6 6 6 6 6 6
                """, result);
    }
}
