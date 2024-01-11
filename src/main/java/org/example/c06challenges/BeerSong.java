package org.example.c06challenges;

// Algorithm to count down from 99 to 0 beer.

public class BeerSong {
    public static void main(String[] args) {
        int beerNumber = 99;
        String word = "bottles ";
        while (beerNumber > 0) {
            if (beerNumber == 1) {
                word = "bottle ";
            }
            System.out.println(beerNumber + " " + word + " of beer on the wall");
            System.out.println(beerNumber + " " + word + "of beer.");
            System.out.println("Take me down");
            System.out.println("Pass it around");
            beerNumber = beerNumber - 1;
            if (beerNumber > 1) {
                System.out.println(beerNumber + " " + word + " of beer on the walls");
            } else {
                System.out.println("No more bottles of beer on the wall");
            }
        }
    }
}