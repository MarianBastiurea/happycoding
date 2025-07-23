package com.marianbastiurea.c01operators.calculate;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class WinningNumberTest {

    @Test
    void winnerFirst(){
        int number=102;
        String result="Winner";
        assertEquals(result,WinningNumber.findWinningNumber(number));
    }

    @Test
    void notWinnerFirst(){
        int number=101;
        String result="Not winner";
        assertEquals(result,WinningNumber.findWinningNumber(number));
    }

    @Test
    void notWinnerSecond(){
        int number=132;
        String result="Not winner";
        assertEquals(result,WinningNumber.findWinningNumber(number));
    }
}
