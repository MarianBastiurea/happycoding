package org.example.c02controlflow;

import java.util.Scanner;
/*
Write a program in Java to display a pattern like a diamond.

    *
   ***
  *****
 *******
*********
 *******
  *****
   ***
    *

 */

public class DisplaysAPatternLikeADiamondUsingAsterisk {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of asterisk at diagonal: ");
        int numberOfRows = sc.nextInt();
        //print upper half of diamond
        int identation = numberOfRows - 1;
        for (int i = 1; i <= numberOfRows; i++) {
            for (int j = identation; j > 0; j--) {
                System.out.print(" ");
            }
            identation = identation - 1;
            for (int k = 1; k <= i; k++) {
                System.out.print(" * ");
            }
            System.out.println();
        }
        String space = " ";
        //print lower half of diamond
        int i = 1;
        identation = numberOfRows - 1;
        for (int k = numberOfRows + i; k <= (2 * numberOfRows - 1); k++) {
            System.out.print(space.repeat(i));
            i = i + 1;
            for (int j = identation; j > 0; j--) {
                System.out.print(" * ");
            }
            identation = identation - 1;
            System.out.println();
        }
    }
}


