package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class C06P10_Find_Factorial_Of_A_Number_Using_Recursion_Test {
    @Test
    public void First5Factorial(){
        int number=5;
        int numberFactorial=120;
        int result=C06P10_Find_Factorial_Of_A_Number_Using_Recursion.FactorialNNaturalNumbers(number);
        assertEquals(numberFactorial,result);
    }
    @Test
    public void First1Factorial(){
        int number=1;
        int numberFactorial=1;
        int result=C06P10_Find_Factorial_Of_A_Number_Using_Recursion.FactorialNNaturalNumbers(number);
        assertEquals(numberFactorial,result);
    }

}
