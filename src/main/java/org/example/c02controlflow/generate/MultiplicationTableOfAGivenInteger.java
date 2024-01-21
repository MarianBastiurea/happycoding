package org.example.c02controlflow.generate;


public class MultiplicationTableOfAGivenInteger {
    public static String displayMultiplicationTable(int number) {
        String result = "";
        int k = 0;
        for (int i = 1; i <= 10; i++) {
            result += number + "x" + i + "=" + number * i;
            result += "\n";
        }
        return result;
    }
}
