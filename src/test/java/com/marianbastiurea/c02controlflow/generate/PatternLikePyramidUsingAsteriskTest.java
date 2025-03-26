package com.marianbastiurea.c02controlflow.generate;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PatternLikePyramidUsingAsteriskTest {
    @Test
    public void given6RowsGenerateAPatternLikeAPyramidWithAsterisk() {
        int number = 6;
        String result = PatternLikePyramidUsingAsterisk.generatePyramid(number);
        assertEquals("""
                     *
                    * *
                   * * *
                  * * * *
                 * * * * *
                * * * * * *
                """, result);
    }
}
