package com.marianbastiurea.c01operators.calculate;

/*
Flaviu needs your help writing a program that will tell him whether a given number is a winning number in a contest.

To qualify as a winning number, the number must meet all the following criteria:

✅ It must be a natural number with exactly 3 digits.
🔀 The parity (evenness or oddness) of the first digit must be different from the parity of the last digit.
⚖️ The middle digit must always be even.
📥 Input:
A natural number x is read from the keyboard.

📤 Output:
Print one of the following messages:

"Winner" if the number meets all the winning criteria
"Not winner" otherwise
⚠️ Constraints and Notes:
The input number will always be in the range: 100 ≤ x ≤ 999
The digit 0 is considered an even digit
 */

public class WinningNumber {

    static String findWinningNumber(int number) {
        int firstDigit = number / 100;
        int middleDigit = (number / 10) % 10;
        int lastDigit = number % 10;
        String answer = "";
        if (((firstDigit % 2) != (lastDigit % 2)) && ( middleDigit % 2 == 0)) {
            answer = "Winner";
        } else {
            answer = "Not winner";
        }
        return answer;
    }

}
