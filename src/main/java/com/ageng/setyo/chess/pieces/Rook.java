package com.ageng.setyo.chess.pieces;

import com.ageng.setyo.chess.Cell;

public class Rook extends Piece {
    public Rook(PieceColor pieceColor) {
        super(pieceColor, "R");
    }

    /**
     * Rook Moves
     * Y   -----------
     * +1    -   X   -
     *  0    X   R   X
     * -1    -   X   -
     * X->  -1   0  +1
     * */
    @Override
    public boolean validateMove(int newX, int newY, int oldX, int oldY, Cell[][] cells, boolean firstMove) {
        // Regular or Attack Move
        // Only Straight
        return newX == oldX || newY == oldY;
    }
}
