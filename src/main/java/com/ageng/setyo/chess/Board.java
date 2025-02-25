package com.ageng.setyo.chess;

import com.ageng.setyo.chess.pieces.*;

import java.util.Scanner;

public class Board {
    Cell[][] cells = new Cell[8][8];
    boolean isGameOver = false;

    public Board() {
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                cells[i][j] = new Cell();
                if (i == 1 || i == 6) cells[i][j] = new Cell(new Pawn((i == 1 ? PieceColor.WHITE : PieceColor.BLACK)));
            }
        }

        // Initialize BLACK
        cells[7][7] = new Cell(new Rook(PieceColor.BLACK));
        cells[7][6] = new Cell(new Knight(PieceColor.BLACK));
        cells[7][5] = new Cell(new Bishop(PieceColor.BLACK));
        cells[7][4] = new Cell(new King(PieceColor.BLACK));
        cells[7][3] = new Cell(new Queen(PieceColor.BLACK));
        cells[7][2] = new Cell(new Bishop(PieceColor.BLACK));
        cells[7][1] = new Cell(new Knight(PieceColor.BLACK));
        cells[7][0] = new Cell(new Rook(PieceColor.BLACK));

        // Initialize WHITE
        cells[0][7] = new Cell(new Rook(PieceColor.WHITE));
        cells[0][6] = new Cell(new Knight(PieceColor.WHITE));
        cells[0][5] = new Cell(new Bishop(PieceColor.WHITE));
        cells[0][4] = new Cell(new King(PieceColor.WHITE));
        cells[0][3] = new Cell(new Queen(PieceColor.WHITE));
        cells[0][2] = new Cell(new Bishop(PieceColor.WHITE));
        cells[0][1] = new Cell(new Knight(PieceColor.WHITE));
        cells[0][0] = new Cell(new Rook(PieceColor.WHITE));

    }

    public void play() {
        Scanner scanner = new Scanner(System.in);

        int turn = 0;
        while (!isGameOver) {

            /*
             * First Move is White turn
             * Second Move is Black Turn
             */

            turn++;
            printBoard();
            boolean isBlackMove = turn % 2 == 0;

            if (isBlackMove)System.out.println("Black move");
            else System.out.println("White move");


            String position = scanner.nextLine();
            String[] positions = position.split(" ");
            if (positions.length != 2) {
                System.out.println("Invalid Position");
                continue;
            }

            String oldPosition = positions[0];
            String newPosition = positions[1];

            if (oldPosition.length() != 2 || newPosition.length() != 2) {
                System.out.println("Invalid Move");
                continue;
            }

            int oldX = oldPosition.charAt(0) - 'A';
            int oldY = Integer.parseInt(oldPosition.substring(1)) - 1;

            // Get the Piece on Cell
            Piece piece = cells[oldY][oldX].getPiece();

            // Validate Picking Piece
            if (piece == null) {
                System.out.println("The cell is empty");
                continue;
            }

            if (isBlackMove != piece.getPieceColor().equals(PieceColor.BLACK)) {
                System.out.println("You chose the wrong piece color");
                continue;
            }

            int[] newPos = moveTo(newPosition);
            int newX = newPos[0];
            int newY = newPos[1];

            // validate piece
            boolean firstMove = turn <= 2;

            boolean validMove = piece.validateMove(newX, newY, oldX, oldY, cells, firstMove);
            if (!validMove) {
                System.out.println("Invalid Move");
                continue;
            }

            Cell targetCell = cells[newY][newX];

            // Check if win
            Piece targetPiece = targetCell.getPiece();
            if (targetPiece != null) {
                if (targetPiece.getSymbol().equals("K")) {
                    System.out.println("The Winner is " + (isBlackMove ? "Black" : "White"));
                    isGameOver = true;
                }
            }

            // Set the Piece on new Cell
            targetCell.setPiece(piece);

            // Set the old position to null
            cells[oldY][oldX] = new Cell();
        }
    }

    public int[] moveTo(String newPosition) {
        int newX = newPosition.charAt(0) - 'A';
        int newY = Integer.parseInt(newPosition.substring(1)) - 1;

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
                    System.out.print(" " + String.valueOf(Character.toChars(j + 65)) + " ");
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
