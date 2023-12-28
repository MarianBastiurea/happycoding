package org.example;

import java.util.Scanner;

/* Write a C program to read a password until it is valid.
For wrong password print "Incorrect password" and for correct password print,
 "Correct password" and quit the program. The correct password is 1234.

Test Data :
Input the password: 1234
Expected Output:
Correct password

https://www.w3resource.com/c-programming-exercises/basic-declarations-and-expressions/c-programming-basic-exercises-36.php
 */

public class C04P36_Check_A_Password {
    public static void main(String[] args) {
        //input
        String password = "1234";
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter password of 4 character maximum: ");
        String userInput = sc.nextLine();

        //algorithm
        String message = checkPassword(password, userInput);

        //output
        System.out.println(message);
    }

    public static String checkPassword(String password, String str) {
        String message;
        if (password.equals(str)) {
            message = "Correct password";
        } else {
            message = "Incorrect password";
        }
        return message;
    }
}