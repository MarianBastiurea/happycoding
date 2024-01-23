package org.example.c02controlflow.generate;

/*
Write a program in Java to make a pyramid pattern with numbers increased by 1.

   1
  2 3
 4 5 6
7 8 9 10

 */

public class PatternLikeAPyramidWithNumberIncreasedBy1 {
    public static String generatePyramid(int number) {
        String pyramid="";
        int count=0;
        int identation = number - 1;
        for (int i = 1; i <= number; i++) {
            for (int j = identation; j > 0; j--) {
                pyramid+=" ";
            }
            identation = identation - 1;
            for (int k = 1; k <= i; k++) {
                count = count + 1;
                pyramid+=count + " ";
            }
            pyramid=pyramid.substring(0,pyramid.length()-1);
            pyramid+="\n";
        }
        return  pyramid;
    }
}
