package com.ageng.setyo.chess;

import com.ageng.setyo.chess.pieces.PieceColor;
import com.ageng.setyo.chess.pieces.King;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class KingTest {

    @Test
    @DisplayName("Should Return True for Valid Move")
    public void shouldReturnTrueForValidMove() {
        Cell[][] cells = new Cell[8][8];
        King king = new King(PieceColor.WHITE);

        /**
         * Straight Move
         * D1 D2 = 41 42
         * D2 D1 = 42 41
         */
        assertTrue(king.validateMove(4,2,4,1, cells, false));
        assertTrue(king.validateMove(4,1,4,2, cells, false));


        /**
         * Diagonal Move
         * D1 E2 = 41 52
         * E2 F1 = 52 61
         */

        assertTrue(king.validateMove(5,2,4,1, cells, false));
        assertTrue(king.validateMove(6,1,5,2, cells, false));


    }
}
