package org.example.c02controlflow;

public class ConvertANumberToAHexadecimalNumber {
    public static String DecimalToHexadecimal(int Number) {
        int temp;
        String hexadecimalNumber = "";
        char[] hexchars = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
        while (Number > 0) {
            temp = Number % 16;
            hexadecimalNumber = hexchars[temp] + hexadecimalNumber;
            Number = Number / 16;
        }
        return hexadecimalNumber;
    }
}
