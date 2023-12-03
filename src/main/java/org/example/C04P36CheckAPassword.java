package org.example;

import java.util.Scanner;

public class C04P36CheckAPassword {
    public static void main(String[] args) {
        //input
        String password = "1234";
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter password of 4 character maximum: ");
        String userInput = sc.nextLine();

        //algoritm
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