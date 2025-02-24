package com.ageng.setyo.chess.pieces;

import com.ageng.setyo.chess.Cell;

public class King extends Piece {
    public King(PieceColor pieceColor) {
        super(pieceColor, "K");
    }

    /**
     * King Moves
     * Y   -----------
     * +1    X   X   X
     *  0    X   K   X
     * -1    X   X   X
     * X->  -1   0  +1
     * */
    @Override
    public boolean validateMove(int newX, int newY, int oldX, int oldY, Cell[][] cells, boolean firstMove) {
        // Regular or Attack Move

        int absX = Math.abs(newX - oldX);
        int absY = Math.abs(newY - oldY);

        // For straight Move
        if (newX == oldX || newY == oldY) {
            return absX == 1 || absY == 1;
        }

        // For Diagonal Move
        if (absX == absY) {
            return absX == 1 && absY == 1;
        }

        return false;
    }
}
