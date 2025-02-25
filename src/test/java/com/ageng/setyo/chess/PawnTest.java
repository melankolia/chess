package com.ageng.setyo.chess;

import com.ageng.setyo.chess.pieces.Pawn;
import com.ageng.setyo.chess.pieces.PieceColor;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertTrue;


public class PawnTest {


    @Test
    @DisplayName("Should Return True for Valid Move")
    public void shouldReturnTrueForValidMove() {
        Cell[][] cells = new Cell[8][8];
        Pawn pawn = new Pawn(PieceColor.WHITE);

        /**
         * Straight Move
         * D2 D3 = 42 43
         * D2 D4 = 42 44
         */
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                cells[i][j] = new Cell();
            }
        }



        assertTrue(pawn.validateMove(4,3,4,2, cells, false));
        assertTrue(pawn.validateMove(4,4,4,2, cells, true));

        cells[3][2] = new Cell(new Pawn(PieceColor.BLACK));

        /**
         * Diagonal Attack Move
         * A2 B3 = 12 23
         */

        assertTrue(pawn.validateMove(2,3,1,2, cells, false));

    }
}
