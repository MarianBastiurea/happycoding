package org.example.c01declarationsandexpressions;

import java.util.Scanner;

/*
Write a Java program to display multiple variables.
*/
public class VariablesTypes {
    public static void main(String[] args) {
        int a = 125;
        int b = 12345;
        long ax = 1234567890;
        short s = 4043;
        double x = 2.13459;
        double dx = 1.1415927;
        char c = 'W';
        long ux = 541567890;
        int cAsInt;
        int charAndIntSum;
        double a3;
        double a4;
        long a5;
        double a6;
        int a7;
        long a8;
        int a9;
        long a10;
        long a11;
        cAsInt = Integer.valueOf(c);
        charAndIntSum = a + cAsInt;
        a3 = x + cAsInt;
        a4 = dx + x;
        a5 = ((int) dx) + ax;
        a6 = a + x;
        a7 = s + b;
        a8 = ax + b;
        a9 = s + cAsInt;
        a10 = ax + cAsInt;
        a11 = ax + ux;
        System.out.println("Sum between integer and char:");
        System.out.println("a+c="+a +"+" + c +"=" + a + "+" + cAsInt + "=" + charAndIntSum);
        System.out.println("x+c=" + x + "+" + cAsInt + "=" + a3);
        System.out.println("dx+x=" + dx + "+" + x + "=" + a4);
        System.out.println("((int)dx+ax)=" + a5);
        System.out.println("a+x=" + a6);
        System.out.println("s+b=" + a7);
        System.out.println("ax+b=" + a8);
        System.out.println("s+c=" + a9);
        System.out.println("ax+c=" + ax + "+" + cAsInt + "=" + a10);
        System.out.println("ax+ux=" + ax + "+" + ux + "=" + a11);
    }

    public static class DisplayTheMultiplicationTableOfAGivenInteger {
        public static void main(String[] args) {
            int givenNumber;
            int multipliedNumber;
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter integer:");
            givenNumber = sc.nextInt();
            for (int i = 1; i < 11; ++i) {
                multipliedNumber = givenNumber * i;
                System.out.println(givenNumber + "X" + i + "=" + multipliedNumber);
            }
        }
    }
}
