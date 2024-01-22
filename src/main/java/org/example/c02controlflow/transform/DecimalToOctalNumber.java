package org.example.c02controlflow.transform;

/*
 Write a program in java to transform a decimal number in octal number.
 */
public class DecimalToOctalNumber {
    public static String decimalToOctal(int Number) {
        int temp;
        String octalNumber = "";
        char[] octal = {'0', '1', '2', '3', '4', '5', '6', '7'};
        while (Number > 0) {
            temp = Number % 8;
            octalNumber = octal[temp] + octalNumber;
            Number = Number / 8;
        }
        return octalNumber;
    }
}
