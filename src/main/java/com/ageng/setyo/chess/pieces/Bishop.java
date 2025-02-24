package com.ageng.setyo.chess.pieces;

import com.ageng.setyo.chess.Cell;

public class Bishop extends Piece{
    public Bishop(PieceColor pieceColor) {
        super(pieceColor, "B");
    }

    /**
     * Pawn Moves
     * Y   -----------
     * +1    X   -   X
     *  0    -   B   -
     * -1    X   -   X
     * X->  -1   0  +1
     * */
    @Override
    public boolean validateMove(int newX, int newY, int oldX, int oldY, Cell[][] cells, boolean firstMove) {
        return Math.abs(newX - oldX) == Math.abs(newY - oldY);
    }
}
