package com.marianbastiurea.c02controlflow.generate;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

 class PatternLikeAPyramidWhereFirstAndLastNumberAre1Test {
    @Test
     void generatePyramid() {
        int number = 5;
        String pyramid = PatternLikeAPyramidWhereFirstAndLastNumberAre1.generatePyramid(number);
        assertEquals("""
                        1
                      1 2 1
                    1 2 3 2 1
                  1 2 3 4 3 2 1
                1 2 3 4 5 4 3 2 1
                """, pyramid);

    }
}
