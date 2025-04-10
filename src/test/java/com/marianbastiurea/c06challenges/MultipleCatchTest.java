package com.marianbastiurea.c06challenges;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;

 class MultipleCatchTest {
    @Test
    void ifXIsOThenThrowsArithmeticException(){
        MultipleCatch mc=new MultipleCatch();
        assertThrows(ArithmeticException.class, ()-> mc.tryAndCatch(0));
    }

    @Test
     void ifXIs1ThenThrowsArrayIndexOutOfBoundsException(){
         MultipleCatch mc=new MultipleCatch();
         assertThrows(ArrayIndexOutOfBoundsException.class, ()-> mc.tryAndCatch(1));
     }
}
