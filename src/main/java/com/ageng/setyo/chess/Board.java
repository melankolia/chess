package com.ageng.setyo.chess;

import java.util.Arrays;
import java.util.Scanner;

public class Board {
    Cell[][] cells = new Cell[8][8];
    boolean isGameOver = false;

    public Board() {
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                cells[i][j] = new Cell();
                if (i == 1 || i == 6) cells[i][j] = new Cell(new Pawn(i, 0, i == 1));
            }
        }
    }

    public void play() {
        Scanner scanner = new Scanner(System.in);
        while (!isGameOver) {
            printBoard();

            System.out.print("Enter Coordinates From: ");
            String oldPosition = scanner.nextLine();

            if (oldPosition.length() != 2) {
                System.out.println("Move is Invalid");
                continue;
            }

            int oldX = Integer.parseInt(oldPosition.substring(1)) - 1;
            int oldY = oldPosition.charAt(0) - 'A';

            // Get the Piece on Cell
            Piece piece = cells[oldX][oldY].getPiece();

            if (piece == null) {
                System.out.println("Cell is doesn't have a Piece");
                continue;
            }

            int[] newPos = moveTo(scanner);
            int newX = newPos[0];
            int newY = newPos[1];

            // validate piece
            boolean validMove = piece.validateMove(newX, newY, oldX, oldY);
            if (!validMove) {
                System.out.println("Move is Invalid");
                continue;
            }

            // Set the Piece on new Cell
            cells[newX][newY].setPiece(piece);
            // Set the position for the Piece on Cell
            cells[newX][newY].getPiece().setPosition(newX, newY);

            // Set the old position to null
            cells[oldX][oldY] = new Cell();
        }
    }

    public int[] moveTo(Scanner scanner) {
        System.out.print("Enter Coordinates To: ");
        String newPosition = scanner.nextLine();
        int newX = Integer.parseInt(newPosition.substring(1)) - 1;
        int newY = newPosition.charAt(0) - 'A';

        return new int[]{ newX, newY };
    }

    public void printBoard() {

//        Should print backward 8 - 1
        for (int i = 7; i >= -1; i--) {
            for (int j = 0; j <= 7; j++) {

                // Print ABCDFEGH
                if (i == -1) {
                    // 65 is ASCII code for A
                    if (j == 0) { System.out.print("X "); }
                    System.out.print(String.valueOf(Character.toChars(j + 65)) + " ");
                    continue;
                }


                if (j == 0) System.out.print((i + 1) + " ");

                if (j < 7) {
                    System.out.print(cells[i][j] + " ");
                    continue;
                }

                System.out.println(cells[i][j]);
            }
        }
        System.out.println();
    }
}
