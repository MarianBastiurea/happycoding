package com.marianbastiurea.c05recursion;

public class SumWithoutTest {

    public static int findSum(int start, int number) {
        int sum = 0;
        if (number >= start) {
            sum = number + findSum(start, number - 1);
        }
        return sum;
    }

    public static void main(String[] args) {
        int number = 3;
        int start = 1;
        System.out.println("sum of number fom " + start + " to " + number + " is " + findSum(start, number));
    }

}
