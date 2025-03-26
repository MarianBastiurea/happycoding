package com.marianbastiurea.c06challenges;

/* 100 doors

100 doors in a row are all initially closed. You make 100 passes by the doors. The first time through, you visit every door and toggle the door (if the door is closed, you open it; if it is open, you close it).
The second time you only visit every 2nd door (door #2, #4, #6, ...).
The third time, every 3rd door (door #3, #6, #9, ...), etc, until you only visit the 100th door.

Question: What state are the doors in after the last pass? Which are open, which are closed?


This class just toggle 100  passes on doors.
 */
public class OneHundredDoors {
    private OneHundredDoors() {
    }

    public static String[][] toggle100Doors() {
        String[][] resultMatrix = new String[100][2]; // Doors are from 1 to 100

        // Initialize all doors as 'Closed'
        for (int i = 0; i < 100; i++) {
            resultMatrix[i][0] = String.valueOf(i + 1);
            resultMatrix[i][1] = "Closed";
        }

        // Simulate 100 passes
        for (int j = 1; j <= 100; j++) {
            toggleDoors(resultMatrix, j);
        }
        return resultMatrix;
    }

    // Toggle doors based on the pass number and update the matrix
    private static void toggleDoors(String[][] resultMatrix, int pass) {
        for (int i = pass - 1; i < 100; i += pass) {
            if (resultMatrix[i][1].equals("Closed")) {
                resultMatrix[i][1] = "Open";
            } else {
                resultMatrix[i][1] = "Closed";
            }
        }
    }
}









