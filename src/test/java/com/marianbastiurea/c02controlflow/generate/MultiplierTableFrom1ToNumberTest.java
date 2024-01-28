package com.marianbastiurea.c02controlflow.generate;

import com.marianbastiurea.c02controlflow.generate.MultiplierTableFrom1ToNumber;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MultiplierTableFrom1ToNumberTest {
    @Test
    public void multiplierTableFrom1to3() {
        int number = 3;
        String result = MultiplierTableFrom1ToNumber.multiplyNumber(number);
        assertEquals("""
                1x1=1
                1x2=2
                1x3=3
                2x1=2
                2x2=4
                2x3=6
                3x1=3
                3x2=6
                3x3=9
                4x1=4
                4x2=8
                4x3=12
                5x1=5
                5x2=10
                5x3=15
                6x1=6
                6x2=12
                6x3=18
                7x1=7
                7x2=14
                7x3=21
                8x1=8
                8x2=16
                8x3=24
                9x1=9
                9x2=18
                9x3=27
                10x1=10
                10x2=20
                10x3=30
                """, result);
    }
}
