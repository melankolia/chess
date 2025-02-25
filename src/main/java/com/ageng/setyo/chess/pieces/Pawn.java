package com.ageng.setyo.chess.pieces;

import com.ageng.setyo.chess.Cell;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Pawn extends Piece {
    public Pawn(PieceColor pieceColor) {
        super(pieceColor, "P");
    }

    /**
     * Pawn Moves
     * Y   -----------
     * +1    X   X   X
     *  0    -   P   -
     * -1    X   X   X
     * X->  -1   0  +1
     * */
    @Override
    public boolean validateMove(int newX, int newY, int oldX, int oldY, Cell[][] cells, boolean firstMove) {
        Cell targetCell = cells[newY][newX];

        int validFirstMove = firstMove ? 2 : 1;
        int stepY = (newY - oldY);

        if (targetCell.getPiece() == null) {
            // Regular Move
            if (newX != oldX) return false;
            if (this.pieceColor == PieceColor.WHITE && stepY > 0 && stepY <= validFirstMove) return true;
            return this.pieceColor == PieceColor.BLACK && stepY < 0 && stepY >= (-1 * validFirstMove);
        }

        // Diagonal or Attack Move
        if (newX == oldX) return false;
        if (this.pieceColor == PieceColor.WHITE && stepY == 1) return true;
        return this.pieceColor == PieceColor.BLACK && stepY == -1;
    }
}
