package com.ageng.setyo.chess;

public class Cell {
    Piece piece;

    public Cell() {}

    public Cell(Piece piece) {
        this.piece = piece;
    }

    public Piece getPiece() {
        return piece;
    }

    public void setPiece(Piece piece) {
        this.piece = piece;
    }

    @Override
    public String toString() {
        if (this.piece != null) return this.piece.toString();
        return "-";
    }
}
