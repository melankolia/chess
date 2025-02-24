package com.ageng.setyo.chess.pieces;

import com.ageng.setyo.chess.Cell;

public class Piece {
    PieceColor pieceColor;
    String symbol;

    public Piece(PieceColor pieceColor, String symbol) {
        this.pieceColor = pieceColor;
        this.symbol = symbol;
    }

    public boolean validateMove(int newX, int newY, int oldX, int oldY, Cell[][] Cells, boolean firstMove) {
        return true;
    }

    @Override
    public String toString() {
        return pieceColor == PieceColor.WHITE ? ("W" + symbol) : ("B" + symbol);
    }
}
