package com.ageng.setyo.chess;

import com.ageng.setyo.chess.pieces.Pawn;
import com.ageng.setyo.chess.pieces.PieceColor;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class CellTest {

    @Test
    @DisplayName("Should Return Correct Piece")
    public void testCorrectPiece() {
        Cell cell = new Cell();
        cell.setPiece(new Pawn(PieceColor.WHITE));
        assertInstanceOf(Pawn.class, cell.getPiece());
    }

    @Test
    @DisplayName("Should Return PK toString: when Piece is Pawn Class")
    public void testPKToString() {
        Cell cell = new Cell();
        cell.setPiece(new Pawn(PieceColor.WHITE));
        assertEquals("WP", cell.toString());
    }

    @Test
    @DisplayName("Should Return -- toString: when Piece is Not Yet Initialized")
    public void testCorrectToString() {
        Cell cell = new Cell();
        assertEquals("--", cell.toString());
    }
}
