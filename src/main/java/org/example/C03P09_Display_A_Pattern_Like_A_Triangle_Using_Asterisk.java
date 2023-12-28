package org.example;

import java.util.Scanner;
/* Write a program in Java to display a pattern like a right angle triangle using an asterisk.

The pattern like :

*
**
***
****

https://www.w3resource.com/c-programming-exercises/for-loop/c-for-loop-exercises-9.php
 */

public class C03P09_Display_A_Pattern_Like_A_Triangle_Using_Asterisk {
    public static void main(String[] args) {
        String asterix = "*";
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows:");
        int numberOfRows = sc.nextInt();
        for (int i = 1; i <= numberOfRows; ++i) {
            System.out.println(asterix.repeat(i)+" ");
        }
    }
}