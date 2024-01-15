package org.example.c02controlflow.calculate;

/*
Write a program in Java to find the sum of the series [ 1-X^2/2!+X^4/4!- .........].
Test Data :
Input the Value of x :2
Input the number of terms : 5
Expected Output :
the sum = -0.415873
Number of terms = 5
value of x = 2.000000

 */

public class SumOfASeries {
    public static String findSum(int x, int n) {
        int powerOfX = 0;
        double result = 1;
        String resultString;
        double b, sum; // b have values -1 and 1 give the sign of series term
        for (int i = 2; i <= n; i++) {
            int fact = 1;
            powerOfX = powerOfX + 2;
            if (i % 2 == 0) {
                b = -1;
            } else {
                b = 1;
            }
            for (int j = 1; j <= powerOfX; j++) {
                fact = fact * j;
            }
            sum = Math.pow(x, powerOfX) / fact * b;
            result = sum + result;
        }
        resultString = String.format("%.3f", result);
        // just to compare result with sum value from test, I changed "result" from double in
        //resultString and keep just first 3 decimals.
        return resultString;
    }
}