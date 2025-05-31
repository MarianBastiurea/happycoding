package com.marianbastiurea.c06challenges;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

/*Starting in 2024, the organizers of the International Chess Competition in Japan plan to introduce new challenges and digitize the tournament, enabling participants from all around the world to compete remotely.

As a programmer on the organizing team, you've been assigned the task of developing a feature that identifies which chess piece appears most frequently on the chessboard.

Task
You are given a square matrix of characters with n rows and n columns, representing the configuration of a chessboard. Each character in the matrix represents a specific type of piece, with the following meanings:

T – Rook
R – King
r – Queen
P – Pawn
C – Knight
N – Bishop
0 – an empty square
Determine which piece appears most frequently in the matrix.

Input
The first line contains a natural number n – the size of the chessboard (1 ≤ n ≤ 20).
The following n lines each contain n characters, with no spaces between them, representing the pieces on the board.
Output
Print the character corresponding to the chess piece that appears most frequently on the board.
If the board contains only empty squares (0), output the message:
:(
If multiple pieces tie for the highest frequency, print the lexicographically greatest character among them.
Constraints
1 ≤ n ≤ 20
Only characters listed above (T, R, r, P, C, N, 0) will appear in the matrix.
Lexicographic order follows the standard ASCII rules (e.g., 'r' > 'T').

 */


public class ChessPieceFrequency {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter the size of the chessboard (n): ");
            int n = Integer.parseInt(scanner.nextLine());

            char[][] board = new char[n][n];
            System.out.println("Enter the " + n + " rows of the chessboard, each with " + n + " characters:");
            System.out.println("Use characters: T, R, r, P, C, N for chess pieces and 0 for empty squares.");

            for (int i = 0; i < n; i++) {
                while (true) {
                    System.out.print("Row " + (i + 1) + ": ");
                    String line = scanner.nextLine().trim();

                    if (line.length() == n && line.matches("[TRrPCN0]{" + n + "}")) {
                        board[i] = line.toCharArray();
                        break;
                    } else {
                        System.out.println("Invalid input. Make sure the row has exactly " + n + " valid characters.");
                    }
                }
            }
            Map<Character, Integer> frequencyMap = new HashMap<>();
            Set<Character> validPieces = Set.of('T', 'R', 'r', 'P', 'C', 'N');
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    char piece = board[i][j];
                    if (validPieces.contains(piece)) {
                        frequencyMap.put(piece, frequencyMap.getOrDefault(piece, 0) + 1);
                    }
                }
            }
            if (frequencyMap.isEmpty()) {
                System.out.println(":(");
            } else {
                char maxPiece = 0;
                int maxFrequency = 0;
                for (Map.Entry<Character, Integer> entry : frequencyMap.entrySet()) {
                    char piece = entry.getKey();
                    int count = entry.getValue();

                    if (count > maxFrequency || (count == maxFrequency && piece > maxPiece)) {
                        maxFrequency = count;
                        maxPiece = piece;
                    }
                }
                System.out.println("The most frequent piece on the board is: " + maxPiece);
            }

            scanner.close();
        }
}