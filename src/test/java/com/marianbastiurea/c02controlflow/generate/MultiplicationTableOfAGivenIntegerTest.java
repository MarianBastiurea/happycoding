package com.marianbastiurea.c02controlflow.generate;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

 class MultiplicationTableOfAGivenIntegerTest {
    @Test
     void multiplicationTableFor5() {
        int number = 5;
        String result = MultiplicationTableOfAGivenInteger.displayMultiplicationTable(number);
        assertEquals("""
                5x1=5
                5x2=10
                5x3=15
                5x4=20
                5x5=25
                5x6=30
                5x7=35
                5x8=40
                5x9=45
                5x10=50
                """, result);
    }
}
