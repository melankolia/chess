package com.ageng.setyo.chess;

public class Pawn extends Piece {
    public Pawn(int positionX, int positionY, boolean isWhite) {
        super(positionX, positionY, isWhite, "P");
    }

    @Override
    public boolean validateMove(int newX, int newY, int oldX, int oldY) {
        if (this.isWhite) return newX == oldX && (newY - oldY) < 1;
        else return newX == oldX && (newY - oldY) > 1;
    }
}
