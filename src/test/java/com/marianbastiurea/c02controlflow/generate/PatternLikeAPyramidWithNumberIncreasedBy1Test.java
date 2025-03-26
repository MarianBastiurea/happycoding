package com.marianbastiurea.c02controlflow.generate;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PatternLikeAPyramidWithNumberIncreasedBy1Test {
    @Test
    public void given5RowsThenGenerateAPyramidWithNumberIncreasedBy1() {
        int number = 5;
        String pyramid = PatternLikeAPyramidWithNumberIncreasedBy1.generatePyramid(number);
        assertEquals("""
                    1
                   2 3
                  4 5 6
                 7 8 9 10
                11 12 13 14 15
                """, pyramid);
    }
}
