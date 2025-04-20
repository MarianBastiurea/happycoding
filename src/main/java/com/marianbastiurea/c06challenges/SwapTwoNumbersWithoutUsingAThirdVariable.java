package com.marianbastiurea.c06challenges;

public class SwapTwoNumbersWithoutUsingAThirdVariable {

    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        System.out.println("Initial value of a is: " + a);
        System.out.println("initial value of b is: "+b);
        b=b+a;
        a=b-a;
        b=b-a;
        System.out.println("Final value of a is: " + a);
        System.out.println("Final value of b is: "+b);
    }
}
