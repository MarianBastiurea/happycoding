package org.example.c02controlflow.generate;

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

public class PatternLikeADiamondUsingAsterisk {
    private PatternLikeADiamondUsingAsterisk () {}

    public static String generateDiamond(int numberOfRows) {
        String diamond ="";
        //print upper half of diamond
        int identation = numberOfRows - 1;
        for (int i = 1; i <= numberOfRows; i++) {
            for (int j = identation; j > 0; j--) {
                diamond+=" ";
            }
            identation = identation - 1;
            for (int k = 1; k <= i; k++) {
                diamond+=" * ";
            }
            diamond+="\n";
        }
        String space = " ";
        //print lower half of diamond
        int i = 1;
        identation = numberOfRows - 1;
        for (int k = numberOfRows + i; k <= (2 * numberOfRows - 1); k++) {
            diamond+=space.repeat(i);
            i = i + 1;
            for (int j = identation; j > 0; j--) {
                diamond+=" * ";
            }
            identation = identation - 1;
            diamond+="\n";
        }
        return diamond;
    }
}


