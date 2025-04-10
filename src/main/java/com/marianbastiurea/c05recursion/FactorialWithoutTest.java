package com.marianbastiurea.c05recursion;

public class FactorialWithoutTest {

    public static int findFactorial(int x) {
        if (x == 0 || x == 1) {
            return 1;
        } else
            return x * findFactorial(x - 1);
    }

    public static void main(String[] args) {
        int x = 3;
        System.out.println("factorial for " + x + " is " + findFactorial(x));
    }

}



