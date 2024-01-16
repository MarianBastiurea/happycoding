package org.example.c02controlflow.validate;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
public class FindIfANumberIsAPerfectNumberTest {
    @Test
    public void six(){
        int number=6;
        boolean result=FindIfANumberIsAPerfectNumber.findPerfectNumber(number);
        assertTrue(result);
    }
    @Test
    public void nine(){
        int number=9;
        boolean result=FindIfANumberIsAPerfectNumber.findPerfectNumber(number);
        assertFalse(result);
    }
    @Test
    public void oneHundred(){
        int number=100;
        boolean result=FindIfANumberIsAPerfectNumber.findPerfectNumber(number);
        assertFalse(result);
    }
    @Test
    public void twentyEight(){
        int number=28;
        boolean result=FindIfANumberIsAPerfectNumber.findPerfectNumber(number);
        assertTrue(result);
    }
}
