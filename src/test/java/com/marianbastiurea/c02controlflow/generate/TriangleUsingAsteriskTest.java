package com.marianbastiurea.c02controlflow.generate;

import com.marianbastiurea.c02controlflow.generate.TriangleUsingAsterisk;
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
