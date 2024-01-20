package org.example.c02controlflow.generate;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MultiplicationTableOfAGivenIntegerTest {
    @Test
    public void multiplicationTableFor5(){
        int number=5;
        int[] myArray={5,10,15,20,25,30,35,40,45,50};
        int[] result=MultiplicationTableOfAGivenInteger.displayMultiplicationTable(number);
        assertArrayEquals(result,myArray);
    }
    @Test
    public void multiplicationTableFor0(){
        int number=0;
        int[] myArray={0,0,0,0,0,0,0,0,0,0};
        int[] result=MultiplicationTableOfAGivenInteger.displayMultiplicationTable(number);
        assertArrayEquals(result,myArray);
    }
}
