package com.ageng.setyo.chess;

import com.ageng.setyo.chess.pieces.Piece;
import com.ageng.setyo.chess.pieces.PieceColor;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class PieceTest {

    @Test
    @DisplayName("Should Return Correct Symbol")
    public void shouldReturnCorrectSymbol() {

        Piece king = new Piece(PieceColor.BLACK, "K");
        assertEquals("K", king.getSymbol());

        Piece queen = new Piece(PieceColor.WHITE, "Q");
        assertEquals("Q", queen.getSymbol());

        Piece bishop = new Piece(PieceColor.WHITE, "B");
        assertEquals("B", bishop.getSymbol());

        Piece rook = new Piece(PieceColor.WHITE, "R");
        assertEquals("R", rook.getSymbol());

        Piece knight = new Piece(PieceColor.WHITE, "N");
        assertEquals("N", knight.getSymbol());

        Piece pawn = new Piece(PieceColor.WHITE, "P");
        assertEquals("P", pawn.getSymbol());
    }

    @Test
    @DisplayName("Should Return Correct Color")
    public void shouldReturnCorrectColor() {
        Piece black = new Piece(PieceColor.BLACK, "K");
        assertEquals(PieceColor.BLACK, black.getPieceColor());

        Piece white = new Piece(PieceColor.WHITE, "K");
        assertEquals(PieceColor.WHITE, white.getPieceColor());
    }

    @Test
    @DisplayName("Should Return Correct toString")
    public void shouldReturnCorrectToString() {
        Piece king = new Piece(PieceColor.WHITE, "K");
        assertEquals("WK", king.toString());

        Piece queen = new Piece(PieceColor.WHITE, "Q");
        assertEquals("WQ", queen.toString());

        Piece bishop = new Piece(PieceColor.WHITE, "B");
        assertEquals("WB", bishop.toString());

        Piece rook = new Piece(PieceColor.WHITE, "R");
        assertEquals("WR", rook.toString());

        Piece knight = new Piece(PieceColor.WHITE, "N");
        assertEquals("WN", knight.toString());

        Piece pawn = new Piece(PieceColor.WHITE, "P");
        assertEquals("WP", pawn.toString());

        Piece blackKing = new Piece(PieceColor.BLACK, "K");
        assertEquals("BK", blackKing.toString());

        Piece blackQueen = new Piece(PieceColor.BLACK, "Q");
        assertEquals("BQ", blackQueen.toString());

        Piece blackBishop = new Piece(PieceColor.BLACK, "B");
        assertEquals("BB", blackBishop.toString());

        Piece blackRook = new Piece(PieceColor.BLACK, "R");
        assertEquals("BR", blackRook.toString());

        Piece blackKnight = new Piece(PieceColor.BLACK, "N");
        assertEquals("BN", blackKnight.toString());

        Piece blackPawn = new Piece(PieceColor.BLACK, "P");
        assertEquals("BP", blackPawn.toString());

    }
}
