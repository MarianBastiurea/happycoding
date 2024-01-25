package org.example.c06challenges;

// Algorithm to count down from 99 to 0 beer.

public class BeerSong {
    public static String generateLyrics(int beerNumber) {
        String lyrics = "";
        String word = "bottles ";
        while (beerNumber > 0) {
            if (beerNumber == 1) {
                word = "bottle ";
            }
            lyrics += beerNumber + " " + word + " of beer on the wall" + "\n";
            lyrics += beerNumber + " " + word + "of beer." + "\n";
            lyrics += "Take me down" + "\n";
            lyrics += "Pass it around" + "\n";
            beerNumber = beerNumber - 1;
            if (beerNumber > 1) {
                lyrics += beerNumber + " " + word + " of beer on the walls" + "\n";
            } else {
                lyrics += "No more bottles of beer on the wall" + "\n";
            }
        }
        return lyrics;
    }
}