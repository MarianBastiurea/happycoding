package com.marianbastiurea.c02controlflow.generate;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PatternLikePyramidWithANumberRepeatingInSameRowTest {
    @Test
    public void given6RowsGenerateAPatternLikePyramidWithANumberRepeatingInSameRowTest() {
        int number = 6;
        String result = PatternLikePyramidWithANumberRepeatingInSameRow.generatePyramid(number);
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
