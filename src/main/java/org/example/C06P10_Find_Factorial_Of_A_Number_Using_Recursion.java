package org.example;

public class C06P10_Find_Factorial_Of_A_Number_Using_Recursion {
    public static int FactorialNNaturalNumbers(int number) {
        int Factorial=1;
        int NumberToFactorial=1;
        if (NumberToFactorial<=number) {
            Factorial=number* FactorialNNaturalNumbers(number-1);
        }
        return Factorial;
    }
}
