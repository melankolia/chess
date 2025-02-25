package com.ageng.setyo.chess;

import com.ageng.setyo.chess.pieces.Bishop;
import com.ageng.setyo.chess.pieces.PieceColor;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class BishopTest {
    @Test
    @DisplayName("Should Return True for Valid Move")
    public void shouldReturnCorrectSymbol() {
        Cell[][] cells = new Cell[8][8];
        Bishop bishop = new Bishop(PieceColor.WHITE);

        /**
         * Diagonal Move
         * C1 G5 = 31 75
         * G5 H4 = 75 84
         */
        assertTrue(bishop.validateMove(7,5,3,1, cells, false));
        assertTrue(bishop.validateMove(8,4,7,5, cells, false));
    }
}
