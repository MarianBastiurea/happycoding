package com.marianbastiurea.c02controlflow.transform;

public class NumberToAHexadecimalNumber {
    private NumberToAHexadecimalNumber () {}

    public static String decimalToHexadecimal(int number) {
        int temp;
        String hexadecimalNumber = "";
        char[] hexchars = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
        while (number > 0) {
            temp = number % 16;
            hexadecimalNumber = hexchars[temp] + hexadecimalNumber;
            number = number / 16;
        }
        return hexadecimalNumber;
    }
}
