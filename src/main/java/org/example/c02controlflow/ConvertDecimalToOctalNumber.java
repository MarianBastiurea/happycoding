package org.example.c02controlflow;

public class ConvertDecimalToOctalNumber {
    public static  String decimalToOctal(int Number){
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
