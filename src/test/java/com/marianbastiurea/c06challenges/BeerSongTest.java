package com.marianbastiurea.c06challenges;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class BeerSongTest {
    @Test
     void storeLyricsOfBeerSong() {
        int beerNumber = 99;
        String result = BeerSong.generateLyrics(beerNumber);
        assertEquals("""
                99 bottles  of beer on the wall
                99 bottles of beer.
                Take me down
                Pass it around
                98 bottles  of beer on the walls
                98 bottles  of beer on the wall
                98 bottles of beer.
                Take me down
                Pass it around
                97 bottles  of beer on the walls
                97 bottles  of beer on the wall
                97 bottles of beer.
                Take me down
                Pass it around
                96 bottles  of beer on the walls
                96 bottles  of beer on the wall
                96 bottles of beer.
                Take me down
                Pass it around
                95 bottles  of beer on the walls
                95 bottles  of beer on the wall
                95 bottles of beer.
                Take me down
                Pass it around
                94 bottles  of beer on the walls
                94 bottles  of beer on the wall
                94 bottles of beer.
                Take me down
                Pass it around
                93 bottles  of beer on the walls
                93 bottles  of beer on the wall
                93 bottles of beer.
                Take me down
                Pass it around
                92 bottles  of beer on the walls
                92 bottles  of beer on the wall
                92 bottles of beer.
                Take me down
                Pass it around
                91 bottles  of beer on the walls
                91 bottles  of beer on the wall
                91 bottles of beer.
                Take me down
                Pass it around
                90 bottles  of beer on the walls
                90 bottles  of beer on the wall
                90 bottles of beer.
                Take me down
                Pass it around
                89 bottles  of beer on the walls
                89 bottles  of beer on the wall
                89 bottles of beer.
                Take me down
                Pass it around
                88 bottles  of beer on the walls
                88 bottles  of beer on the wall
                88 bottles of beer.
                Take me down
                Pass it around
                87 bottles  of beer on the walls
                87 bottles  of beer on the wall
                87 bottles of beer.
                Take me down
                Pass it around
                86 bottles  of beer on the walls
                86 bottles  of beer on the wall
                86 bottles of beer.
                Take me down
                Pass it around
                85 bottles  of beer on the walls
                85 bottles  of beer on the wall
                85 bottles of beer.
                Take me down
                Pass it around
                84 bottles  of beer on the walls
                84 bottles  of beer on the wall
                84 bottles of beer.
                Take me down
                Pass it around
                83 bottles  of beer on the walls
                83 bottles  of beer on the wall
                83 bottles of beer.
                Take me down
                Pass it around
                82 bottles  of beer on the walls
                82 bottles  of beer on the wall
                82 bottles of beer.
                Take me down
                Pass it around
                81 bottles  of beer on the walls
                81 bottles  of beer on the wall
                81 bottles of beer.
                Take me down
                Pass it around
                80 bottles  of beer on the walls
                80 bottles  of beer on the wall
                80 bottles of beer.
                Take me down
                Pass it around
                79 bottles  of beer on the walls
                79 bottles  of beer on the wall
                79 bottles of beer.
                Take me down
                Pass it around
                78 bottles  of beer on the walls
                78 bottles  of beer on the wall
                78 bottles of beer.
                Take me down
                Pass it around
                77 bottles  of beer on the walls
                77 bottles  of beer on the wall
                77 bottles of beer.
                Take me down
                Pass it around
                76 bottles  of beer on the walls
                76 bottles  of beer on the wall
                76 bottles of beer.
                Take me down
                Pass it around
                75 bottles  of beer on the walls
                75 bottles  of beer on the wall
                75 bottles of beer.
                Take me down
                Pass it around
                74 bottles  of beer on the walls
                74 bottles  of beer on the wall
                74 bottles of beer.
                Take me down
                Pass it around
                73 bottles  of beer on the walls
                73 bottles  of beer on the wall
                73 bottles of beer.
                Take me down
                Pass it around
                72 bottles  of beer on the walls
                72 bottles  of beer on the wall
                72 bottles of beer.
                Take me down
                Pass it around
                71 bottles  of beer on the walls
                71 bottles  of beer on the wall
                71 bottles of beer.
                Take me down
                Pass it around
                70 bottles  of beer on the walls
                70 bottles  of beer on the wall
                70 bottles of beer.
                Take me down
                Pass it around
                69 bottles  of beer on the walls
                69 bottles  of beer on the wall
                69 bottles of beer.
                Take me down
                Pass it around
                68 bottles  of beer on the walls
                68 bottles  of beer on the wall
                68 bottles of beer.
                Take me down
                Pass it around
                67 bottles  of beer on the walls
                67 bottles  of beer on the wall
                67 bottles of beer.
                Take me down
                Pass it around
                66 bottles  of beer on the walls
                66 bottles  of beer on the wall
                66 bottles of beer.
                Take me down
                Pass it around
                65 bottles  of beer on the walls
                65 bottles  of beer on the wall
                65 bottles of beer.
                Take me down
                Pass it around
                64 bottles  of beer on the walls
                64 bottles  of beer on the wall
                64 bottles of beer.
                Take me down
                Pass it around
                63 bottles  of beer on the walls
                63 bottles  of beer on the wall
                63 bottles of beer.
                Take me down
                Pass it around
                62 bottles  of beer on the walls
                62 bottles  of beer on the wall
                62 bottles of beer.
                Take me down
                Pass it around
                61 bottles  of beer on the walls
                61 bottles  of beer on the wall
                61 bottles of beer.
                Take me down
                Pass it around
                60 bottles  of beer on the walls
                60 bottles  of beer on the wall
                60 bottles of beer.
                Take me down
                Pass it around
                59 bottles  of beer on the walls
                59 bottles  of beer on the wall
                59 bottles of beer.
                Take me down
                Pass it around
                58 bottles  of beer on the walls
                58 bottles  of beer on the wall
                58 bottles of beer.
                Take me down
                Pass it around
                57 bottles  of beer on the walls
                57 bottles  of beer on the wall
                57 bottles of beer.
                Take me down
                Pass it around
                56 bottles  of beer on the walls
                56 bottles  of beer on the wall
                56 bottles of beer.
                Take me down
                Pass it around
                55 bottles  of beer on the walls
                55 bottles  of beer on the wall
                55 bottles of beer.
                Take me down
                Pass it around
                54 bottles  of beer on the walls
                54 bottles  of beer on the wall
                54 bottles of beer.
                Take me down
                Pass it around
                53 bottles  of beer on the walls
                53 bottles  of beer on the wall
                53 bottles of beer.
                Take me down
                Pass it around
                52 bottles  of beer on the walls
                52 bottles  of beer on the wall
                52 bottles of beer.
                Take me down
                Pass it around
                51 bottles  of beer on the walls
                51 bottles  of beer on the wall
                51 bottles of beer.
                Take me down
                Pass it around
                50 bottles  of beer on the walls
                50 bottles  of beer on the wall
                50 bottles of beer.
                Take me down
                Pass it around
                49 bottles  of beer on the walls
                49 bottles  of beer on the wall
                49 bottles of beer.
                Take me down
                Pass it around
                48 bottles  of beer on the walls
                48 bottles  of beer on the wall
                48 bottles of beer.
                Take me down
                Pass it around
                47 bottles  of beer on the walls
                47 bottles  of beer on the wall
                47 bottles of beer.
                Take me down
                Pass it around
                46 bottles  of beer on the walls
                46 bottles  of beer on the wall
                46 bottles of beer.
                Take me down
                Pass it around
                45 bottles  of beer on the walls
                45 bottles  of beer on the wall
                45 bottles of beer.
                Take me down
                Pass it around
                44 bottles  of beer on the walls
                44 bottles  of beer on the wall
                44 bottles of beer.
                Take me down
                Pass it around
                43 bottles  of beer on the walls
                43 bottles  of beer on the wall
                43 bottles of beer.
                Take me down
                Pass it around
                42 bottles  of beer on the walls
                42 bottles  of beer on the wall
                42 bottles of beer.
                Take me down
                Pass it around
                41 bottles  of beer on the walls
                41 bottles  of beer on the wall
                41 bottles of beer.
                Take me down
                Pass it around
                40 bottles  of beer on the walls
                40 bottles  of beer on the wall
                40 bottles of beer.
                Take me down
                Pass it around
                39 bottles  of beer on the walls
                39 bottles  of beer on the wall
                39 bottles of beer.
                Take me down
                Pass it around
                38 bottles  of beer on the walls
                38 bottles  of beer on the wall
                38 bottles of beer.
                Take me down
                Pass it around
                37 bottles  of beer on the walls
                37 bottles  of beer on the wall
                37 bottles of beer.
                Take me down
                Pass it around
                36 bottles  of beer on the walls
                36 bottles  of beer on the wall
                36 bottles of beer.
                Take me down
                Pass it around
                35 bottles  of beer on the walls
                35 bottles  of beer on the wall
                35 bottles of beer.
                Take me down
                Pass it around
                34 bottles  of beer on the walls
                34 bottles  of beer on the wall
                34 bottles of beer.
                Take me down
                Pass it around
                33 bottles  of beer on the walls
                33 bottles  of beer on the wall
                33 bottles of beer.
                Take me down
                Pass it around
                32 bottles  of beer on the walls
                32 bottles  of beer on the wall
                32 bottles of beer.
                Take me down
                Pass it around
                31 bottles  of beer on the walls
                31 bottles  of beer on the wall
                31 bottles of beer.
                Take me down
                Pass it around
                30 bottles  of beer on the walls
                30 bottles  of beer on the wall
                30 bottles of beer.
                Take me down
                Pass it around
                29 bottles  of beer on the walls
                29 bottles  of beer on the wall
                29 bottles of beer.
                Take me down
                Pass it around
                28 bottles  of beer on the walls
                28 bottles  of beer on the wall
                28 bottles of beer.
                Take me down
                Pass it around
                27 bottles  of beer on the walls
                27 bottles  of beer on the wall
                27 bottles of beer.
                Take me down
                Pass it around
                26 bottles  of beer on the walls
                26 bottles  of beer on the wall
                26 bottles of beer.
                Take me down
                Pass it around
                25 bottles  of beer on the walls
                25 bottles  of beer on the wall
                25 bottles of beer.
                Take me down
                Pass it around
                24 bottles  of beer on the walls
                24 bottles  of beer on the wall
                24 bottles of beer.
                Take me down
                Pass it around
                23 bottles  of beer on the walls
                23 bottles  of beer on the wall
                23 bottles of beer.
                Take me down
                Pass it around
                22 bottles  of beer on the walls
                22 bottles  of beer on the wall
                22 bottles of beer.
                Take me down
                Pass it around
                21 bottles  of beer on the walls
                21 bottles  of beer on the wall
                21 bottles of beer.
                Take me down
                Pass it around
                20 bottles  of beer on the walls
                20 bottles  of beer on the wall
                20 bottles of beer.
                Take me down
                Pass it around
                19 bottles  of beer on the walls
                19 bottles  of beer on the wall
                19 bottles of beer.
                Take me down
                Pass it around
                18 bottles  of beer on the walls
                18 bottles  of beer on the wall
                18 bottles of beer.
                Take me down
                Pass it around
                17 bottles  of beer on the walls
                17 bottles  of beer on the wall
                17 bottles of beer.
                Take me down
                Pass it around
                16 bottles  of beer on the walls
                16 bottles  of beer on the wall
                16 bottles of beer.
                Take me down
                Pass it around
                15 bottles  of beer on the walls
                15 bottles  of beer on the wall
                15 bottles of beer.
                Take me down
                Pass it around
                14 bottles  of beer on the walls
                14 bottles  of beer on the wall
                14 bottles of beer.
                Take me down
                Pass it around
                13 bottles  of beer on the walls
                13 bottles  of beer on the wall
                13 bottles of beer.
                Take me down
                Pass it around
                12 bottles  of beer on the walls
                12 bottles  of beer on the wall
                12 bottles of beer.
                Take me down
                Pass it around
                11 bottles  of beer on the walls
                11 bottles  of beer on the wall
                11 bottles of beer.
                Take me down
                Pass it around
                10 bottles  of beer on the walls
                10 bottles  of beer on the wall
                10 bottles of beer.
                Take me down
                Pass it around
                9 bottles  of beer on the walls
                9 bottles  of beer on the wall
                9 bottles of beer.
                Take me down
                Pass it around
                8 bottles  of beer on the walls
                8 bottles  of beer on the wall
                8 bottles of beer.
                Take me down
                Pass it around
                7 bottles  of beer on the walls
                7 bottles  of beer on the wall
                7 bottles of beer.
                Take me down
                Pass it around
                6 bottles  of beer on the walls
                6 bottles  of beer on the wall
                6 bottles of beer.
                Take me down
                Pass it around
                5 bottles  of beer on the walls
                5 bottles  of beer on the wall
                5 bottles of beer.
                Take me down
                Pass it around
                4 bottles  of beer on the walls
                4 bottles  of beer on the wall
                4 bottles of beer.
                Take me down
                Pass it around
                3 bottles  of beer on the walls
                3 bottles  of beer on the wall
                3 bottles of beer.
                Take me down
                Pass it around
                2 bottles  of beer on the walls
                2 bottles  of beer on the wall
                2 bottles of beer.
                Take me down
                Pass it around
                No more bottles of beer on the wall
                1 bottle  of beer on the wall
                1 bottle of beer.
                Take me down
                Pass it around
                No more bottles of beer on the wall
                """, result);
    }
}
