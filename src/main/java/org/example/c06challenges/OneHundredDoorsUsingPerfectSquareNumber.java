package org.example.c06challenges;

/* 100 doors

100 doors in a row are all initially closed. You make 100 passes by the doors. The first time through, you visit every door and toggle the door (if the door is closed, you open it; if it is open, you close it).
The second time you only visit every 2nd door (door #2, #4, #6, ...).
The third time, every 3rd door (door #3, #6, #9, ...), etc, until you only visit the 100th door.

Question: What state are the doors in after the last pass? Which are open, which are closed?

If you solve this problem on a piece of paper will see a two pattern:
First-in fact when you open from 2-nd in 2-nd, from 3-rd in 3-rd door and so on,
you mark as open/closed a door when door's number divide 2,3,4,5...
that means you find door's number divisors. Then count how many divisors a number's door have
and if this number is even the door is closed, if it is odd, the door is open
Second-If from first pattern, you write door's number and status (open or close),
you will notice that door which door's number is a perfect square number will be open
that means doors with number 1, 4, 9,16... will be open.
this Class will use second pattern.
 */
public class OneHundredDoorsUsingPerfectSquareNumber {

    public static String[][] doorStatus() {
        String[][] resultMatrix = new String[100][2];
        resultMatrix[0][0] = "1";
        resultMatrix[0][1] = "Open";
        for (int i = 1; i < 100; i++) {
            resultMatrix[i][0] = Integer.toString(i + 1);
            resultMatrix[i][1] = findSquareNumber(i + 1);
        }
        for (int i = 0; i < 100; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(resultMatrix[i][j]);
            }
        }
        return resultMatrix;
    }

    public static String findSquareNumber(int number) {
        String status = "";
        for (int i = 1; i < number; i++) {
            if (number / i == i && number % i == 0) {
                status = "Open";
                break;
            } else {
                status = "Closed";
            }
        }
        return status;
    }
}
