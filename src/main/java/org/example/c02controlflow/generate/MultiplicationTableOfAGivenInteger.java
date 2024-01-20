package org.example.c02controlflow.generate;


public class MultiplicationTableOfAGivenInteger {
    public static int[] displayMultiplicationTable(int number) {
        int[] result=new int[10];
        int k=0;
        for (int i = 1; i <= 10; i++) {
           result[k] = number * i;
           k++;
        }
        return  result;
    }
}
