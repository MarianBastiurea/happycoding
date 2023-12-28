package org.example;

import java.util.Scanner;

/*Write a Java program to make such a pattern as a pyramid with an asterisk.

   *
  * *
 * * *
* * * *

https://www.w3resource.com/c-programming-exercises/for-loop/c-for-loop-exercises-14.php
 */

public class C03P14_Display_A_Pattern_Like_A_Pyramid_Using_Asterisk {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of Rows: ");
        int numberOfRows = sc.nextInt();
        int rows = numberOfRows - 1;
        for (int i = 1; i <= numberOfRows; ++i) {
            for (int j = rows; j > 0; j--) {
                System.out.print(" ");
            }
            rows = rows - 1;
            for (int k = 1; k <= i; ++k) {
                System.out.print(" *");
            }
            System.out.println();
        }
    }
}
