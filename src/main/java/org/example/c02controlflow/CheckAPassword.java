package org.example.c02controlflow;

/*
Write a Java program to read a password until it is valid.
For wrong password print "Incorrect password" and for correct password print,
 "Correct password" and quit the program. The correct password is 1234.

Test Data :
Input the password: 1234
Expected Output:
Correct password
*/

public class CheckAPassword {

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