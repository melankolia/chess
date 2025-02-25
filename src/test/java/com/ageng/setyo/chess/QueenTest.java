package com.ageng.setyo.chess;

import com.ageng.setyo.chess.pieces.PieceColor;
import com.ageng.setyo.chess.pieces.Queen;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class QueenTest {
    @Test
    @DisplayName("Should Return True for Valid Move")
    public void shouldReturnTrueForValidMove() {
        Cell[][] cells = new Cell[8][8];
        Queen queen = new Queen(PieceColor.WHITE);

        /**
         * Straight Move
         * D1 D5 = 41 45
         * D5 D4 = 45 44
         */
        assertTrue(queen.validateMove(4,5,4,1, cells, false));
        assertTrue(queen.validateMove(4,4,4,5, cells, false));


        /**
         * Diagonal Move
         * D1 G4 = 41 74
         * G4 H3 = 74 83
         */

        assertTrue(queen.validateMove(7,4,4,1, cells, false));
        assertTrue(queen.validateMove(8,3,7,4, cells, false));


    }
}
