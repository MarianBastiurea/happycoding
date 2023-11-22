package org.example;

import java.util.Scanner;

class C04_p36 {
    public static void main(String[] args) {
        String password ="1234";
        String str;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter password of 4 character maximum: ");
        str=sc.nextLine();
        if (password.equals(str)) {
                    System.out.println (" Correct password ");
        } else {
                System.out.println("Incorrect pasword");
            }

    }
}