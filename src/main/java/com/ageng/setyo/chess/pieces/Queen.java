package com.ageng.setyo.chess.pieces;

import com.ageng.setyo.chess.Cell;

public class Queen extends Piece {
    public Queen(PieceColor pieceColor) {
        super(pieceColor, "Q");
    }

    /**
     * Queen Moves
     * Y   -----------
     * +2    X   X   X   X   X
     * +1    X   X   X   X   X
     *  0    X   X   Q   X   X
     * -1    X   X   X   X   X
     * -2    X   X   X   X   X
     * X->  -2  -1   0  +1  +2
     * */
    @Override
    public boolean validateMove(int newX, int newY, int oldX, int oldY, Cell[][] cells, boolean firstMove) {
        // Regular or Attack Move
        // For straight Move
        if (newX == oldX || newY == oldY) return true;

        // For Diagonal Move
        return Math.abs(newX - oldX) == Math.abs(newY - oldY);
    }
}
