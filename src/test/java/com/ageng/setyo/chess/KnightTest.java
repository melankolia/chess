package com.ageng.setyo.chess;

import com.ageng.setyo.chess.pieces.Knight;
import com.ageng.setyo.chess.pieces.PieceColor;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class KnightTest {

    @Test
    @DisplayName("Should Return True for Valid Move")
    public void shouldReturnTrueForValidMove() {
        Cell[][] cells = new Cell[8][8];
        Knight knight = new Knight(PieceColor.WHITE);

        /**
         * L Move
         * B1 C3 = 21 33
         * C3 D5 = 33 45
         */

        assertTrue(knight.validateMove(3,3,2,1, cells, false));
        assertTrue(knight.validateMove(4,5,3,3, cells, false));
    }
}
