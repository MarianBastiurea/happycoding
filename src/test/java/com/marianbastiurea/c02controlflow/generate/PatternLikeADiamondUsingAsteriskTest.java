package com.marianbastiurea.c02controlflow.generate;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PatternLikeADiamondUsingAsteriskTest {

    @Test
    void generateDiamond() {
        int numberOfRows = 5;

        String diamond = PatternLikeADiamondUsingAsterisk.generateDiamond(numberOfRows);

        assertEquals("     * \n" +
                "    *  * \n" +
                "   *  *  * \n" +
                "  *  *  *  * \n" +
                " *  *  *  *  * \n" +
                "  *  *  *  * \n" +
                "   *  *  * \n" +
                "    *  * \n" +
                "     * \n", diamond);
    }
}