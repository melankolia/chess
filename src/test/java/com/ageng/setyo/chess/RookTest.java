package com.ageng.setyo.chess;

import com.ageng.setyo.chess.pieces.PieceColor;
import com.ageng.setyo.chess.pieces.Rook;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class RookTest {

    @Test
    @DisplayName("Should Return True for Valid Move")
    public void testRook() {
        Cell[][] cells = new Cell[8][8];
        Rook rook = new Rook(PieceColor.WHITE);

        /**
         * Straight Move
         * A1 A5 = 11 15
         * A5 E5 = 15 55
         */
        assertTrue(rook.validateMove(1, 5, 1, 1, cells, false));
        assertTrue(rook.validateMove(5, 5, 1, 5, cells, false));
    }
}
