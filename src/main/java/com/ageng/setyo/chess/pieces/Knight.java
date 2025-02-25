package com.ageng.setyo.chess.pieces;

import com.ageng.setyo.chess.Cell;

public class Knight extends Piece {
    public Knight(PieceColor pieceColor) {
        super(pieceColor, "N");
    }

    /**
     * Knight Moves
     * Y   -----------
     * +2    -   X   -   X   -
     * +1    X   -   -   -   X
     *  0    -   -   K   -   -
     * -1    X   -   -   -   X
     * -2    -   X   -   X   -
     * X->  -2  -1   0  +1  +2
     * */
    @Override
    public boolean validateMove(int newX, int newY, int oldX, int oldY, Cell[][] cells, boolean firstMove) {
        // For L Move
        int stepX = Math.abs(newX - oldX);
        int stepY = Math.abs(newY - oldY);

        if (stepX == 1 && stepY == 2) return true;
        if (stepX == 2 && stepY == 1) return true;

        return false;
    }
}
