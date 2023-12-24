package org.example;

public class Convert_Decimal_Number_To_Octal_Number {
    public static  String DecimalToOctal(int Number){
        int temp;
        String octalNumber = "";
        char octal[] = {'0', '1', '2', '3', '4', '5', '6', '7'};
        while (Number > 0) {
            temp = Number % 8;
            octalNumber = octal[temp] + octalNumber;
            Number = Number / 8;
        }
        return octalNumber;
    }
}
